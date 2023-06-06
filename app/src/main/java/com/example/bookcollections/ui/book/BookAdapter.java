package com.example.bookcollections.ui.book;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bookcollections.R;

import java.util.List;

public class BookAdapter extends BaseAdapter {

    private Context context;
    private List<Book> books;

    public BookAdapter(Context context, List<Book> books) {
        this.context = context;
        this.books = books;
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return books.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.fragment_book, parent, false);
        }

        Book book = books.get(position);

        ImageView bookCover = convertView.findViewById(R.id.book_cover);
        TextView bookTitle = convertView.findViewById(R.id.book_title);
        TextView bookAuthor = convertView.findViewById(R.id.book_author);
        TextView publishDate = convertView.findViewById(R.id.publish_date);

        bookCover.setImageDrawable(book.getImage());
        bookTitle.setText(book.getTitle());
        bookAuthor.setText(book.getAuthor());
        publishDate.setText(book.getPublishedDate());

        return convertView;
    }
}
