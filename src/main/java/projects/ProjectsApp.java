package projects;

//1.   Create a class in the projects package named ProjectsApp. The class must have a main() method.
//2.   In the main() method, call the DbConnection.getConnection() method.


import java.sql.Connection;

import projects.dao.DbConnection;

public class ProjectsApp {

	public static void main(String[] args) {
		DbConnection.getConnection();
	}

	
		 

	
	
	
}
