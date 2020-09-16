package day03;

import java.io.Serializable;
import java.util.Date;

//����˽������: 
//String name��int age��String gender ��int salary�� Date hiredate;//��ְʱ��
// 	���幹�췽�����Լ�����get,set����.
// 	����toString��������ʽ��:
//     	����:����,����:25,�Ա�:��,н��:5000,��ְʱ��:2020-01-11
// 	����equals������Ҫ�����֣����䣬�Ա�н�ʶ���ͬ������Ϊ����һ�¡�
// 	ʵ�����л��ӿڣ�������汾�š�
public class Emp implements Serializable{
private static final long serialVersionUID = 1L;
  private String name;
  private int age;
  private String gender;
  private int salary;
  private Date hiredate;
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Emp other = (Emp) obj;
	if (age != other.age)
		return false;
	if (gender == null) {
		if (other.gender != null)
			return false;
	} else if (!gender.equals(other.gender))
		return false;
	if (hiredate == null) {
		if (other.hiredate != null)
			return false;
	} else if (!hiredate.equals(other.hiredate))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (salary != other.salary)
		return false;
	return true;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Date getHiredate() {
	return hiredate;
}
public void setHiredate(Date hiredate) {
	this.hiredate = hiredate;
}
public Emp(String name,int age,String gender ,int salary,Date hiredate) {
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.salary=salary;
    this.hiredate=hiredate;
	  
	  
  }
@Override
public String toString() {
	return "������" + name + ",���䣺" + age + ", �Ա�" + gender + ",н�ʣ� " + salary + ", ��ְʱ�䣺" ;
}
public static void  main(String args[]) {
	Date hiredate=new Date();
	Emp emp=new Emp("����",25,"��",5000,hiredate);
	Emp emp1= new Emp("����",25,"��",5000,hiredate);
	String s1=String.format("%tF", hiredate);
	
	System.out.print(emp.toString());
	System.out.println(s1);
	System.out.println(emp.equals(emp1));
	System.out.println(emp.serialVersionUID);
	
	
	
	
}
	
}