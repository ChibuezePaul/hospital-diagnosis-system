package com.example.demo.activityLog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityLogServiceImpl implements ActivityLogService {

	@Autowired
	ActivityLogRepository activityLogRepository;

//	Get the ActivityLog Table Column Names 
	@Override
	public List<String> getColumns(String tblName) {
		return activityLogRepository.getColName(tblName);
	}
	
//	Get a list of all ActivityLogs and maps it with a key value pair 
//	For it to map appropriately to the right column on the front-end
	@Override
	public List<List<Map<String, String>>> getRoomForTemplate(String tableDetails) {
		List <List<Map<String, String>>> returnList = new ArrayList<>();
		List<ActivityLog> activityLogs = activityLogRepository.findAll();
		for(ActivityLog activityLog:activityLogs) {
			List<Map<String, String>> _activityLog = new ArrayList<>();
			Map<String, String> activityLogMap = new HashMap<>();
			activityLogMap.put("id", activityLog.getId().toString());
			activityLogMap.put("message", String.valueOf(activityLog.getMessage()));
			activityLogMap.put("timestamp", String.valueOf(activityLog.getTimestamp()));
			_activityLog.add(activityLogMap);
			returnList.add(_activityLog);
		}
		return returnList;	
	}
}
