package com.booleanag.capmon;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.booleanag.capmon.model.Capmon;

import java.util.List;

public class CapmonAdapter extends RecyclerView.Adapter<CapmonAdapter.ViewHolder> {

    private final List<Capmon> capmonList;

    public CapmonAdapter(List<Capmon> capmons) {
        capmonList = capmons;
        capmonList.add(new Capmon("Watercapper", "Wasser", "Bubbler", "Capicon"));
        capmonList.add(new Capmon("Firecapper", "Feuer", "Feuersturm", "Feuernation"));
        capmonList.add(new Capmon("Leafcapper", "Pflanze", "Rasierblatt", "Hüetliberg"));
        capmonList.add(new Capmon("Icecapper", "Eis", "Eissturm", "Mount Everest"));
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView imageView;

        public ViewHolder(View view) {
            super(view);

            // Define click listener for the ViewHolder's View
            textView = (TextView) view.findViewById(R.id.capmonNameView);
            imageView = (ImageView) view.findViewById(R.id.capmonImageView);

        }

        public TextView getTextView() {
            return textView;
        }

        public ImageView getImageView() {
            return imageView;
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.fragment_capmon_item, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getTextView().setText(capmonList.get(position).getName());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return capmonList.size();
    }

}
