package com.example.bookcollections.ui.book;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bookcollections.R;
import com.example.bookcollections.model.Book;
import com.example.bookcollections.model.User;

import java.net.URL;
import java.util.List;

public class BookAdapter extends BaseAdapter {

    private final Context context;
    private final List<Book> books;

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
        Button favoriteBtn = convertView.findViewById(R.id.btn_favor);
        Button readBtn = convertView.findViewById(R.id.btn_read);


        URL url = null;

        try {
            url = new URL(book.getImage());
            requestImage(url, bookCover);
        } catch (Exception e) {
            Integer[] imageArray = {
                    R.drawable.image1,
                    R.drawable.image2,
                    R.drawable.image3,
                    R.drawable.image4,
                    R.drawable.image5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image8,
                    R.drawable.image9,
                    R.drawable.image10,
                    R.drawable.image11,
                    R.drawable.image12,
                    R.drawable.image13,
                    R.drawable.image14,
                    R.drawable.image15
            };
            bookCover.setImageResource(imageArray[book.Uid()]);

        }

        favoriteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User.getCurrentUser().AddFavorite(book);
            }

        });

        bookTitle.setText(book.getTitle());
        bookAuthor.setText(book.getAuthor());
        publishDate.setText(book.getPublishedDate());

        return convertView;
    }


    private void requestImage(final URL imgUrl, final ImageView image) throws Exception {

        Bitmap bitmap = null;

        bitmap = BitmapFactory.decodeStream(imgUrl.openStream());
        image.setImageBitmap(bitmap);


    }

}
