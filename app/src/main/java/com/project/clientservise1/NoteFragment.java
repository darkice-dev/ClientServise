package com.project.clientservise1;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.project.clientservise1.Entityes.Note;

import java.util.ArrayList;
import java.util.List;

import static com.project.clientservise1.MainActivity.notes;


/**
 * A simple {@link Fragment} subclass.
 */
public class NoteFragment extends Fragment {

    public NoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewNote = inflater.inflate(R.layout.fragment_note, container, false);

        /**
         * Для показа записей, нажми кнопку записаться и переоткрой фрагмент
         */

        if (!notes.isEmpty()){
            viewNote.findViewById(R.id.notes_recycler_view).setVisibility(View.VISIBLE);
            viewNote.findViewById(R.id.iv_note).setVisibility(View.GONE);
            viewNote.findViewById(R.id.tv_help).setVisibility(View.GONE);
            viewNote.findViewById(R.id.btn_note).setVisibility(View.GONE);
        } else {
            viewNote.findViewById(R.id.notes_recycler_view).setVisibility(View.GONE);
            viewNote.findViewById(R.id.iv_note).setVisibility(View.VISIBLE);
            viewNote.findViewById(R.id.tv_help).setVisibility(View.VISIBLE);
            viewNote.findViewById(R.id.btn_note).setVisibility(View.VISIBLE);
        }

        DataAdapter dataAdapter = new DataAdapter(viewNote.getContext(), notes);

        RecyclerView recyclerView = viewNote.findViewById(R.id.notes_recycler_view);
        recyclerView.setAdapter(dataAdapter);

        return viewNote;
    }

    private static class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

        private LayoutInflater inflater;
        private List<Note> notes;

        DataAdapter(Context context, List<Note> notes) {
            this.notes = notes;
            this.inflater = LayoutInflater.from(context);
        }

        @Override
        public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = inflater.inflate(R.layout.list_service, parent, false);

            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
            Note note = notes.get(position);

            holder.serviceName.setText(note.getServiceName());
            holder.description.setText(note.getDescription());
            holder.appTime.setText(note.getAppTime());
            holder.workTime.setText(note.getWorkTime());
            holder.price.setText(String.format("%s₽", note.getPrice()));
        }

        @Override
        public int getItemCount() {
            return notes.size();
        }

        private static class ViewHolder extends RecyclerView.ViewHolder {
            final TextView serviceName, description, appTime, workTime, price;

            ViewHolder(View view){
                super(view);

                serviceName = view.findViewById(R.id.tv_service_name);
                description = view.findViewById(R.id.tv_description);
                appTime = view.findViewById(R.id.tv_appTime);
                workTime = view.findViewById(R.id.tv_workTime);
                price = view.findViewById(R.id.tv_price);
            }
        }
    }
}


