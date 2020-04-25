package com.cusx.search.service;

import com.cusx.commons.pojo.SearchResult;

public interface SearchService {

	SearchResult search(String keyword, int page, int rows)  throws Exception;
}
