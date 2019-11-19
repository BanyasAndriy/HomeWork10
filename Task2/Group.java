package HomeWork3;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Group implements Voenkom {

	private List<Student> students;
	
	private String name;
	
	public Group(String name ) {
		this.name = name;
	
	   students=new ArrayList<>();
	}
	
	public Group() {
		this.name = "group";
		
		  students=new ArrayList<>();
	}
	
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void addStudents(Student stud){
	   
	students.add(stud);
	
		
	}
	
	
	
	
	public void interactiveAddingObject() {
		
		String name;
		String lastName ;
		String surName ;
		int age;
		String nameOfUniversity;
		String faculty;
		int course;
		String group;
		
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Введіть назву університета : ");
		    nameOfUniversity=scan.nextLine();
		    
		System.out.println("Введіть імя студента: ");
		name= scan.nextLine();
		
		System.out.println("Введіть прізвище студента: ");
	    lastName=scan.nextLine();
	    
	    System.out.println("Введіть по-батькові студента : ");
	    surName=scan.nextLine();
	    
	    System.out.println("Введіть вік студента ");
	    age=scan.nextInt();
	    
	    System.out.println("Введіть факультет : ");
	    faculty=sc.nextLine();
	    
	    System.out.println("Введіть курс :");
	    course=scan.nextInt();
	    
	    System.out.println("Введіть групу :");
	    group=sc.nextLine();
	    
	    
		
		
		
		Student stud = new Student(name,lastName,surName,age,nameOfUniversity,faculty,course,group);
				
		
		addStudents(stud);
		
		
	}
	
	
	
	public void deleteStudents(Student stud) {
		
		students.remove(stud);
	
	}
	
	public Student searchStudent(String lastName){
		Student stud=null;
		
		for (int i = 0; i < students.size(); i++) {
		
		if(students.get(i).getLastName().equals(lastName)) {
			stud=students.get(i);
		}
		}
		
		
		
		return stud;
	}
	

	
	@Override
	public String toString() {
	
		System.out.println(" Група : " + this.getName());
	
		
		 for(int i = 0; i<students.size(); i++) {
	         for (int j = i+1; j<students.size(); j++) {
	          
	       	        	 if(students.get(i).getLastName().compareTo((students.get(j).getLastName()))>0) {
	   
	       	       Student temp = students.get(i);
	               students.set(i,students.get(j)); 
	               students.set(j,temp);
	        
	               
	               
	         }
	       	        	
	      }
		 
		 }
		 
 
	int count=1;
		 for (int i = 0; i < students.size(); i++) {
			 
			 System.out.println( count + ")" + "ПІБ: " + students.get(i).getLastName()+" " + students.get(i).getName() + " " +students.get(i).getSurName()  +  "\n Вік:" + students.get(i).getAge() + " \n Факультет: " + students.get(i).getFaculty() + "\nУніверситет: " + students.get(i).getNameOfUniversity()+ " \n Група: " + students.get(i).getGroup());
		count++;
			 }
		 
		
		return ".";
		
		
	}
	
	
	
public void sortByParametr() {
	
	int parametr;
	Scanner scan = new Scanner(System.in);
	System.out.println("Введіть 1 - для сортування за іменем \n 2 - для сортування за прізвищем \n 3 - для сортування за віком ");
	parametr=scan.nextInt();
	
	
	switch (parametr) {
	case 1:
		sortByName();
		break;
    
	case 2 :
		toString();
		break;
		
	case 3:
		sortByAge();
		break;
			
		
	}
	
	
	}


	
	public void sortStudentsByLastName() {
	System.out.println("Сортування по прізвищу: ");
	toString();	
		
	}
			

	
	
		
	
    public void sortByName() {
    	System.out.println("Cортировка по імені ");
    	 for(int i = 0; i<students.size(); i++) {
	         for (int j = i+1; j<students.size(); j++) {
	          
	        	
	        	 if(students.get(i).getName().compareTo((students.get(j).getName()))>0) {
	               Student temp =students.get(i);
	               students.set(i,students.get(j));
	               students.set(j,temp);
	               
	               
	         }
	      }
		 
		 }
		 
	   
	int count=1;
	 for (int i = 0; i < students.size(); i++) {
		 
		 System.out.println( count + ")" + "ПІБ: " + students.get(i).getLastName()+" " + students.get(i).getName() + " " +students.get(i).getSurName()  +  "\n Вік:" + students.get(i).getAge() + " \n Факультет: " + students.get(i).getFaculty() + "\nУніверситет: " + students.get(i).getNameOfUniversity()+ " \n Група: " + students.get(i).getGroup());
	count++;
		 }
	 
		 	
    	
    	
    }

    public void sortByAge() {
    	
    	System.out.println("Cортировка по віку ");
      	 
    	
    	
    	
    	for(int i = 0; i<students.size(); i++) {
	         for (int j = i+1; j<students.size(); j++) {
	          
	        	 
	        	 if(students.get(i).getAge()>students.get(j).getAge()) {
	        		 Student temp =students.get(i);
		               students.set(i,students.get(j));
		               students.set(j,temp);
	            
	         }
	      }
		 
		 }
		 
	   
    	int count=1;
   	 for (int i = 0; i < students.size(); i++) {
   		
   		 
   		 
   System.out.println( count + ")" + "ПІБ: " + students.get(i).getLastName()+" " + students.get(i).getName() + " " +students.get(i).getSurName()  +  "\n Вік:" + students.get(i).getAge() + " \n Факультет: " + students.get(i).getFaculty() + "\nУніверситет: " + students.get(i).getNameOfUniversity()+ " \n Група: " + students.get(i).getGroup());
   	count++;
   		 }
		 	
    
    	
    }

	@Override
	public List<Student> getStudentsToVoenkom() {
		
		System.out.println("Студенти ,яким потрібно відвідати військомат!");
		int count=0;
	

		List<Student> studToVoenkom = new ArrayList<>();
		int pos=0;
		for (int i = 0; i < studToVoenkom.size(); i++) {
			
			if(students.get(i).getAge()>18) {	
				studToVoenkom.add(students.get(i));
				pos++;
			
			
			
		}
			}	
		
		return studToVoenkom;
		
	}

    public void serelization(File file) {
    	
    	try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))){
    	    
        	
       
        	
        	for(int i = 0; i< students.size();i++) {
        	
        			
        			outputStream.writeUTF(students.get(i).getLastName());
        			outputStream.writeUTF(students.get(i).getName());
        			outputStream.writeUTF(students.get(i).getSurName());
        			outputStream.writeInt(students.get(i).getAge());
        			outputStream.writeUTF(students.get(i).getFaculty());
        			outputStream.writeUTF(students.get(i).getNameOfUniversity());
        			outputStream.writeInt(students.get(i).getCourse());
        			outputStream.writeUTF(students.get(i).getGroup());
        			
        			
        	
        	}
        		
    		 
    		System.out.println("Групу записано у файл : " + file.getName());
    		
    		
				} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
    
    public Group deseralization(File file) {
    	Group gr = new Group();
		String name = null;
		String lastName = null ;
		String surName ;
		int age;
		String nameOfUniversity;
		String faculty;
		int course;
		String group;
    	try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))){
			
    		
    		
    		 for (int i = 0; i < students.size(); i++) {
    		
    			
    			
			lastName=reader.readUTF();  
			name=reader.readUTF();
			surName=reader.readUTF();
			age=reader.readInt();
			faculty=reader.readUTF();
			nameOfUniversity=reader.readUTF();
			course=reader.readInt();
			group=reader.readUTF();
    				
gr.addStudents(new Student(name,lastName,surName,age,nameOfUniversity,faculty,course,group));
    			
    			 
    			 }
    		return gr;
    		
    		
    		
    		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	
    	
    	return null;
    }


   
	
	
	
	
	
	
}
