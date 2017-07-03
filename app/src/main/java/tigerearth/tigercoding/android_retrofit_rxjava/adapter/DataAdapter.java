package tigerearth.tigercoding.android_retrofit_rxjava.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import tigerearth.tigercoding.android_retrofit_rxjava.R;
import tigerearth.tigercoding.android_retrofit_rxjava.model.Andriod;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<Andriod> mAndroidList;

    public DataAdapter(ArrayList<Andriod> androidList) {
        this.mAndroidList = androidList;

    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        holder.mTvName.setText(mAndroidList.get(position).getName());
        holder.mTvVersion.setText(mAndroidList.get(position).getVer());
        holder.mTvApi.setText(mAndroidList.get(position).getApi());
    }

    @Override
    public int getItemCount() {
        return mAndroidList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTvName, mTvVersion, mTvApi;

        ViewHolder(View view) {
            super(view);

            mTvName = (TextView) view.findViewById(R.id.tv_name);
            mTvVersion = (TextView) view.findViewById(R.id.tv_version);
            mTvApi = (TextView) view.findViewById(R.id.tv_api_level);
        }
    }
}
