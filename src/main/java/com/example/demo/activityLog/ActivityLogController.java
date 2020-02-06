package com.example.demo.activityLog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActivityLogController {
	@Autowired
	private ActivityLogService activityLogService;

//	List of all Activities
	@GetMapping("/activitylog/list")
	public String showAll(Model model) {
		String tableName = "activity_log";
		
	    model.addAttribute("tbl", "activityLog");
	    model.addAttribute("tableHead", activityLogService.getColumns(tableName));
	    model.addAttribute("data", activityLogService.getRoomForTemplate(tableName));
        return "admin/record";
    }
}
