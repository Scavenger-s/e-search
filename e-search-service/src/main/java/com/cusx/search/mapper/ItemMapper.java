package com.cusx.search.mapper;

import java.util.List;

import com.cusx.commons.pojo.SearchItem;

public interface ItemMapper {
	List<SearchItem> getItemList();
	
	SearchItem getItemById(long itemId);
}
