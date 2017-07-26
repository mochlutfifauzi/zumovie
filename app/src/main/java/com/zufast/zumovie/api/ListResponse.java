package com.zufast.zumovie.api;

import java.util.List;

/**
 * Created by supertor on 7/26/17.
 */

public class ListResponse {
    List<MovieModel> results;
    int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<MovieModel> getResults() {
        return results;
    }

    public void setResults(List<MovieModel> results) {
        this.results = results;
    }
}
