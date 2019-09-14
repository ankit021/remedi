package com.vnit.form.RepositoryImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vnit.form.Util.StudentConnectionManager;
import com.vnit.form.repository.StudentEnrollRepository;

@Repository
public class StudentEnrollRepositoryImpl implements StudentEnrollRepository {

		private static final String genderSelectSQL="select gender_Name from gender_Details";
		private static final String qualificationSelectSQL="Select Qualification_Name from Qualification_Details";
		private static final String courseSelectSQL="Select course_Name from course_Details";
		private static final String timingSelectSQL="Select timing_Name from timing_Details";
		
		Statement stmt=null;
		ResultSet rs=null;
		Connection con;

	public List<String> listOfGender() {
		con=StudentConnectionManager.getCon();
		List<String> gender=new ArrayList<String>();
		try {
			 stmt=con.createStatement();
			rs=stmt.executeQuery(genderSelectSQL);
			while(rs.next()) {
				String genderName=rs.getString(1);
				gender.add(genderName);
				}
			} 
		catch (SQLException e) {
			e.printStackTrace();
			}
			finally {
			 try{
					if(rs!=null) {
						rs.close();
					}
					if(stmt!=null) {
					stmt.close();
					}
					if(con!=null) {
					con.close();
					}
			 	}
			 catch(Exception e) {
				e.printStackTrace();
					}
				}
		return gender;
	}
	public List<String> listOfQualifications() {
		con=StudentConnectionManager.getCon();
		List<String> qualification=new ArrayList<String>();
		try {
			 stmt=con.createStatement();
			rs=stmt.executeQuery(qualificationSelectSQL);
			while(rs.next()) {
				String qualificationName=rs.getString(1);
				qualification.add(qualificationName);
				}
			} 
		catch (SQLException e) {
			e.printStackTrace();
			}
			finally {
			 try{
					if(rs!=null) {
						rs.close();
					}
					if(stmt!=null) {
					stmt.close();
					}
					if(con!=null) {
					con.close();
					}
			 	}
			 catch(Exception e) {
				e.printStackTrace();
					}
				}
		return qualification;
	}
	public List<String> listOfCourses() {
		con=StudentConnectionManager.getCon();
		List<String> course=new ArrayList<String>();
		try {
			 stmt=con.createStatement();
			rs=stmt.executeQuery(courseSelectSQL);
			while(rs.next()) {
				String courseName=rs.getString(1);
				course.add(courseName);
				}
			} 
		catch (SQLException e) {
			e.printStackTrace();
			}
			finally {
			 try{
					if(rs!=null) {
						rs.close();
					}
					if(stmt!=null) {
					stmt.close();
					}
					if(con!=null) {
					con.close();
					}
			 	}
			 catch(Exception e) {
				e.printStackTrace();
					}
				}
		return course;
	}
	public List<String> listOfTimings() {
		con=StudentConnectionManager.getCon();
		List<String> timing=new ArrayList<String>();
		try {
			 stmt=con.createStatement();
			rs=stmt.executeQuery(timingSelectSQL);
			while(rs.next()) {
				String timingName=rs.getString(1);
				timing.add(timingName);
				}
			} 
		catch (SQLException e) {
			e.printStackTrace();
			}
			finally {
			 try{
					if(rs!=null) {
						rs.close();
					}
					if(stmt!=null) {
					stmt.close();
					}
					if(con!=null) {
					con.close();
					}
			 	}
			 catch(Exception e) {
				e.printStackTrace();
					}
				}
		return timing;
	}
}
