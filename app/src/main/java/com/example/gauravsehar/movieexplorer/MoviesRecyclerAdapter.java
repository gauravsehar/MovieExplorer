package com.example.gauravsehar.movieexplorer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.gauravsehar.movieexplorer.api.Movie;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MoviesRecyclerAdapter extends RecyclerView.Adapter<MoviesRecyclerAdapter.MovieViewHolder> {
    Context context;
    ArrayList<Movie> movies;
    OnItemClickListener listener;

    interface OnItemClickListener {

        void onItemClick(int position);
    }

    public MoviesRecyclerAdapter(Context context,ArrayList<Movie> movies,OnItemClickListener listener){
        this.movies = movies;
        this.context = context;
        this.listener = listener;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.movie_poster, parent, false);
        MovieViewHolder holder = new MovieViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MovieViewHolder holder, int position) {
        Movie movie = movies.get(position);
//        holder.movieName.setText(movie.getTitle());
//        Log.d("123", "onBindViewHolder: "+position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(holder.getAdapterPosition());
            }
        });
        Picasso.get().load("https://image.tmdb.org/t/p/w500"+movie.getPosterPath()).placeholder(R.drawable.ic_launcher_background).into(holder.moviePoster);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class MovieViewHolder extends RecyclerView.ViewHolder {
        //        TextView movieName;
        ImageView moviePoster;
        View itemView;

        public MovieViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
//            movieName = itemView.findViewById(R.id.name);
            moviePoster = itemView.findViewById(R.id.posterImageView);

        }
    }
}
