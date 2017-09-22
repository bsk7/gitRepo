package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;




public class Test {
	
	private String driverName,url,user,pwd;
	private Connection con;
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	public void destroy() throws Exception {
		
		con.close();
		System.out.println("Connection closed");
	}

	
	public void init() throws Exception {
		
		Class.forName(driverName);
		
		con = DriverManager.getConnection(url, user, pwd);
		
		System.out.println("Connection Opened ");
	}
	
	public void save(int id, String name, String add ) throws Exception{
		
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setString(3,add);
		ps.executeUpdate();
		
		System.out.println("insertion success");
	}

}
