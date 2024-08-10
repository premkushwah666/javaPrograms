import java.util.*;

class MapDemo
{
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(1,"prem");
		m.put(2,"shiv");
		m.put(1,"pk");//prem -> pk
		m.putIfAbsent(1,"prem");
		m.putIfAbsent(1,"prem");
		System.out.println(m);


		// System.out.println(m.put(1,"prem"));               //null
		// System.out.println(m.put(2,"shiv"));               //null
		// System.out.println(m.put(1,"pk"));//prem -> pk     //prem
		// System.out.println(m.putIfAbsent(1,"prem"));		  //pk
		// System.out.println(m.putIfAbsent(4,"ray"));		  //null
		
		// output :-> successful add pe null return aayega

		// System.out.println(m.get(1));
		// System.out.println(m.get(2));

		// System.out.println(m.remove(1));
		// System.out.println(m.remove(9));

		// System.out.println(m.remove(1,"pk"));//agar K V same hoga to remove hoga
		// System.out.println(m.remove(2,"prem"));//ni to ni hoga

		// public boolean replace(K, V, V);
        // public V replace(K, V);//esme vo check ni krega
        // System.out.println(m.replace(1,"pk","prem"));
        // System.out.println(m.replace(2,"lala","bala"));
        // System.out.println(m.replace(1,"mann"));  
        // System.out.println(m.replace(5,"mann"));  

		// System.out.println(m.containsKey(1));
		// System.out.println(m.containsKey(4));
		// System.out.println(m.containsValue("prem"));
		// System.out.println(m.containsValue("pk"));
		// System.out.println(m.containsValue("raja"));

		// System.out.println(m.isEmpty());

		// System.out.println(m.size());

		// m.clear();

		// System.out.println(m.keySet());

		// Set k = m.keySet();
		// Iterator i = k.iterator();
		// while(i.hasNext())
		// {
		// 	System.out.println(i.next());
		// }

		// Collection c = m.values();
		// Iterator i1 = c.iterator();
		// while(i1.hasNext())
		// {
		// 	System.out.println(i1.next());
		// }


		// System.out.println(m.entrySet());
		// Set s = m.entrySet();
		// Iterator i = s.iterator();
		// while(i.hasNext())
		// {
		// 	Map.Entry me = (Map.Entry)i.next();
		// 	System.out.println("key is "+me.getKey()+" value is "+me.getValue());
		// 	if("pk".equals(me.getValue()))
		// 	{
		// 		me.setValue("mr.Prem");
		// 	}
		// }
		// Set<Map.Entry> s1 = m.entrySet();
		// System.out.println(s1);


		 //agar key ho to to uski value return krdo ni to default jo value pass kr re h vo return hogi
		// System.out.println(m. getOrDefault(1,"jaya"));  //pk
		// System.out.println(m. getOrDefault(3,"ram"));	//ram
		// System.out.println(m. getOrDefault(23,"not exists"));


		// System.out.println(m.valueSet());

		System.out.println(m);
	}
}


/*


tree
t=1 r=1 e=2 e2
e2 e2 t1 r1 
import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;


        public class Solution {
            
            public static void sortFrequencies(String s)
            {
                    
                
                
            }
            
            public static void main(String args[] ) throws Exception {
              
                Scanner sc = new Scanner(System.in);
                int T = sc.nextInt();
                sc.nextLine();
                while(T--!=0)
                {
                    String s = sc.next();
                    
                    sortFrequencies(s);
                }
                
               
//                   TreeMap<string,int> t = new TreeMap<>(new Comparator(){
//                     public int compare(Object t1,Object t2)
//                     {
//                        TreeMap.Entry tm1 = (TreeMap.Entry)t1; 
//                        TreeMap.Entry tm2 = (TreeMap.Entry)t2; 
                        
//                        int i = tm1.getValue();
//                        int j = tm2.getValue(); 
                        
//                        if(i==j)
//                        {
//                            String s1 = tm1.getKey();
//                            String s2 = tm1.getKey();
//                            retrun s1.compareTo(s2);
//                        }
//                        return i-j;
//                     }
//                 }); 
                

                
            }
        }



*/