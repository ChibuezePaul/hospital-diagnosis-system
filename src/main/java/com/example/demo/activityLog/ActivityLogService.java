package com.example.demo.activityLog;

import java.util.List;
import java.util.Map;

public interface ActivityLogService {
	
	List<List<Map<String, String>>> getRoomForTemplate(String tableDetails);

	List<String> getColumns(String tblName);
}
