package com.example.cities.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/cities/view/CountryListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/cities/view/CountryListAdapter$ViewHolder;", "itemClickListener", "Lcom/example/cities/interfaces/ItemClickListener;", "Lcom/example/cities/model/Country;", "(Lcom/example/cities/interfaces/ItemClickListener;)V", "data", "", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_qaDebug"})
public final class CountryListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.cities.view.CountryListAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.cities.model.Country> data;
    private final com.example.cities.interfaces.ItemClickListener<com.example.cities.model.Country> itemClickListener = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.cities.model.Country> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.cities.model.Country> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.cities.view.CountryListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.cities.view.CountryListAdapter.ViewHolder holder, int position) {
    }
    
    public CountryListAdapter(@org.jetbrains.annotations.NotNull()
    com.example.cities.interfaces.ItemClickListener<com.example.cities.model.Country> itemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0019\u0010\u000e\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/example/cities/view/CountryListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "txtCapital", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "getTxtCapital", "()Landroid/widget/TextView;", "txtCurrency", "getTxtCurrency", "txtName", "getTxtName", "txtPopulation", "getTxtPopulation", "configureRow", "", "country", "Lcom/example/cities/model/Country;", "app_qaDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView txtName = null;
        private final android.widget.TextView txtPopulation = null;
        private final android.widget.TextView txtCurrency = null;
        private final android.widget.TextView txtCapital = null;
        
        public final android.widget.TextView getTxtName() {
            return null;
        }
        
        public final android.widget.TextView getTxtPopulation() {
            return null;
        }
        
        public final android.widget.TextView getTxtCurrency() {
            return null;
        }
        
        public final android.widget.TextView getTxtCapital() {
            return null;
        }
        
        public final void configureRow(@org.jetbrains.annotations.NotNull()
        com.example.cities.model.Country country) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}