import java.io.*;
import java.util.*;

class Test
{
	public static void main(String[] args) {
		TodoList t = new TodoList();
		Scanner sc = new Scanner(System.in);
		String title,desc,status;
		while(true)
		{
			t.taskList();
			System.out.println("1. new Task");
			System.out.println("2. updateTask");
			System.out.println("3. deleteTask");
			System.out.println("4. updateStatus");
			System.out.println("5. exit");
			switch(sc.nextInt())
			{
				case 1:
					sc.nextLine();
					System.out.println("Enter Task title :");
					title = sc.nextLine();
					System.out.println("Enter Description :");
					desc = sc.nextLine();
					status = "pending";
					t.addTask(title,desc,status);
					break;
				case 5:
					System.exit(0);
					break;
				case 3:
					System.out.println("enter task number :");
					t.deleteTask(sc.nextInt()-1);
					break;	
				case 4:
					 System.out.println("enter task number :");
				     t.updateStatus(sc.nextInt()-1);
				     break;

				default: System.out.println("Oopss wrong choice ! ");		
			}

		}
	}
}

class TodoList
{
	public void taskList()
	{
		try
		{
			ArrayList list = (ArrayList)HandleFile.read();
			if(list==null)
			{
				System.out.println("no task found ! ");
			}
			else
			{

				System.out.println("===================================================================================================================================");
				for(int i=0; i<list.size(); i++)
				{
					System.out.println(i+1+" => "+list.get(i));
				}
				System.out.println("===================================================================================================================================");
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

    public void addTask(String title, String desc,String status)
	{
		try
		{
			Task task = new Task(title,desc,status);
			ArrayList al = (ArrayList)HandleFile.read();

			if(al==null)
			{
				al = new ArrayList();
			}
			al.add(task);
			HandleFile.write(al);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void updateStatus(int taskIndex)
	{
		try
		{
			ArrayList al = (ArrayList)HandleFile.read();

			if(al==null)
			{
				System.out.println("NO tasks are available !");
			}
			else
			{
				if(taskIndex>=0 && taskIndex<al.size())
				{
					Task task = (Task)al.get(taskIndex);
					if(task.getStatus().equals("pending"))
					{
						task.setStatus("done !");
					}
					else
					{
						task.setStatus("pending");
					}
				}
				else
				{
					System.out.println("no tasks");
				}
				HandleFile.write(al);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void updateTask()
	{
		//code
	}

	public void deleteTask(int num)
	{
		try
		{
			ArrayList al = (ArrayList)HandleFile.read();
			if(al==null)
				System.out.println("no such task found !");
			else
			{
				//if()
				al.remove(num);
				HandleFile.write(al);
			}
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			//before removing we can also check condition it it int range or not
			// 0 to al.size-1
			System.out.println("task doesn't exists !");
		}
	}
}


class HandleFile{

 	public static void write(Object data)
 	{
 		try
 		{
 			FileOutputStream fos = new FileOutputStream("todoList.obj");
 			ObjectOutputStream os = new ObjectOutputStream(fos);
 			os.writeObject(data);
 			os.close();
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 		}
 	}

 	public static Object read()
 	{
 		try
 		{
 			FileInputStream fis = new FileInputStream("todoList.obj");
 			ObjectInputStream is = new ObjectInputStream(fis);
 			Object ob = is.readObject();
 			is.close();
 			return ob;
 		}
 		catch(Exception e)
 		{
 			e.printStackTrace();
 		}
 		return null;
 	}
 }

 class Task implements Serializable
 {
 	private String title,desc,status;
 	Task(String title,String desc,String status)
 	{
 		this.title = title;
 		this.desc = desc;
 		this.status = status;
 	}
 	Task(){}

 	public void setTitle(String title)
 	{
 		this.title = title;
 	}
 	public void setDesc(String desc)
 	{
 		this.desc = desc;
 	}
 	public void setStatus(String status)
 	{
 		this.status = status;
 	}

 	public String getTitle()
 	{
 		return this.title;
 	}
 	public String getDesc()
 	{
 		return this.desc;
 	}
 	public String getStatus()
 	{
 		return this.status;
 	}

 	public String toString()
 	{
 		return "title = "+title+" || desc = "+desc+" || status = "+status;
 	}
 }