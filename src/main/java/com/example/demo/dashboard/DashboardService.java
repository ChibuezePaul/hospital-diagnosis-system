package com.example.demo.dashboard;

import java.util.List;

public interface DashboardService {
	public Dashboard addIcon(Dashboard icon);
	void removeIcon(Long id);
	List<Dashboard>  fetchIcon();
	

}
