package com.example.gauravsehar.movieexplorer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.gauravsehar.movieexplorer.api.ApiClient;
import com.example.gauravsehar.movieexplorer.api.Movie;
import com.example.gauravsehar.movieexplorer.api.MoviesList;

import java.util.ArrayList;
import java.util.Collections;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class LatestMoviesFragment extends Fragment {

    PopularMoviesFragment.MovieSelectedCallback mCallback;
    RecyclerView recyclerView;
    //    ProgressBar progressBar;
    MoviesRecyclerAdapter moviesRecyclerAdapter;
    ArrayList<Movie> movies = new ArrayList<>();

    public LatestMoviesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_latest_movies, container, false);

        recyclerView = view.findViewById(R.id.LatestMoviesRecyclerView);
//        progressBar = view.findViewById(R.id.moviesListProgressBar);

        fetchMovies();
        moviesRecyclerAdapter = new MoviesRecyclerAdapter(getContext(), movies, new MoviesRecyclerAdapter.OnItemClickListener(){
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getContext(),"Not Implemented",Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(getContext(),MovieDetailScrollingActivity.class);
//                intent.putExtra("testid",movies.get(position).getId());
//                startActivity(intent);
            }
        });
        recyclerView.setAdapter(moviesRecyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if(!recyclerView.canScrollHorizontally(1)){
                    Toast.makeText(getContext(),"LAst",Toast.LENGTH_LONG).show();
                }
            }
        });
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(ItemTouchHelper.UP | ItemTouchHelper.DOWN, ItemTouchHelper.RIGHT | ItemTouchHelper.LEFT) {
            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                int from = viewHolder.getAdapterPosition();
                int to = target.getAdapterPosition();
                Collections.swap(movies, from, to);
                moviesRecyclerAdapter.notifyItemMoved(from, to);
                return true;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

                int position = viewHolder.getAdapterPosition();
                movies.remove(position);
                moviesRecyclerAdapter.notifyItemRemoved(position);

            }
        });
        itemTouchHelper.attachToRecyclerView(recyclerView);


        return view;
    }

    private void fetchMovies() {

//        toggleListVisibility(true);


        Call<MoviesList> call = ApiClient.getInstance().getTmdbApi().getNowPlayingMovies(Constants.apiKey, Constants.language,Constants.page);
        call.enqueue(new Callback<MoviesList>() {

            @Override
            public void onResponse(Call<MoviesList> call, Response<MoviesList> response) {
                MoviesList moviesList = response.body();
                Toast.makeText(getContext(),String.valueOf(response.code()),Toast.LENGTH_LONG).show();

                if (moviesList != null) {
                    ArrayList<Movie> movieArrayList = moviesList.getMovies();
                    movies.clear();
                    movies.addAll(movieArrayList);
                    moviesRecyclerAdapter.notifyDataSetChanged();
                }
                else {
                    Toast.makeText(getContext(),"movielist response null",Toast.LENGTH_LONG).show();
                }
//                toggleListVisibility(false);
            }

            @Override
            public void onFailure(Call<MoviesList> call, Throwable t) {

            }
        });


    }

}
