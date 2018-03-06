package com.algoprog;

import java.util.ArrayList;

public class Pagination {
    private ArrayList<Result> results;
    private int pageSize;

    public Pagination(ArrayList<Result> results, int pageSize) throws Exception {
        if(results==null) {
            throw new Exception("Results are null");
        }
        else if(pageSize<=0) {
            throw new Exception("Page size should be > 0");
        }
        else {
            this.results = new ArrayList<>();
            this.results.addAll(results);
            this.pageSize = pageSize;
        }
    }

    /**
     * Shows the next page
     * @param start start from this item index
     * @return next page number
     */
    public int nextPage(int start) {
        if(hasNext(start)) {
            showResults(start+pageSize);
            return (start+pageSize)/pageSize+1;
        }
        return -1; // if there is no next page
    }

    /**
     * Shows the previous page
     * @param start start from this item index
     * @return previous page number
     */
    public int previousPage(int start) {
        if(hasPrevious(start)) {
            showResults(start-pageSize);
            return (start-pageSize)/pageSize+1;
        }
        return -1; // if there is no previous page
    }

    /**
     * Shows results starting from start index
     * @param start start from this item index
     */
    public void showResults(int start) {
        int limit = Math.min(results.size(), start+pageSize);
        for (int i=start; i<limit; i++) {
            System.out.println(results.get(i));
        }
        System.out.println("---------------------");
    }

    /**
     * Checks is there is next page
     * @param start start from this item index
     * @return true if there is next page
     */
    private boolean hasNext(int start) {
        return start + pageSize < results.size();
    }

    /**
     * Checks if there is previous page
     * @param start start from this item index
     * @return true if there is previous page
     */
    private boolean hasPrevious(int start) {
        return start - pageSize >= 0;
    }
}
