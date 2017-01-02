package com.race.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.race.admin.action.Action;

public interface RaceAction extends Action{
	public String execute(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException;
}
