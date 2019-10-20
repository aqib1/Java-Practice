import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {
	public MainClass() {
		System.out.println("He");
	}
	public void MainClass() {
		System.out.println("lo");
	}
	public static void main(String[] args) {
		 String s = "Hello";
		 String t = new String(s);
		 if ("Hello".equals(s)) System.out.println("one");
		 if (t == s) System.out.println("two");
		 if (t.equals(s)) System.out.println("three");
		 if ("Hello" == s) System.out.println("four");
		 if ("Hello" == t) System.out.println("five"); 
//		File file = new File("index.txt");
//		if (!file.exists()) {
//
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		}
		
		//Byte Streams
		//1 byte - 8 bits of data
		//Writer
//		try(FileOutputStream outputStream = new FileOutputStream(file,true)){
//			String message = "Hi every one!!\n";
//			byte [] _data = message.getBytes();
//			outputStream.write(_data);
//			outputStream.flush();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		//Reader
//		FileInputStream inputStream = null;
//		try {
//			inputStream = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				inputStream.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		try(FileInputStream inputStream = new FileInputStream(file)){
//			byte [] _data = new byte [(int)file.length()];
//			inputStream.read(_data);
//			for(byte _b : _data) {
//				System.out.print((char)_b);
//			}
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
		
		
		
		// before Java 1.2
		// 1 - Vector Fifo
		// Vector<Integer> v = new Vector<>();
		// for(int x=0;x<=85;x++) {
		// v.add(x);
		// }
		//
		// System.out.println(v.capacity());
		// v.set(48,5000);
		// v.trimToSize();
		// System.out.println(v.get(48));
		// System.out.println(v.capacity());
		// System.out.println(value);
		// LIFO => Stack
		// Stack<Integer> stack= new Stack<>();
		// stack.push(1);
		// stack.push(3);
		// stack.push(5);
		// System.out.println(stack);
		//
		// System.out.println(stack.peek());
		// System.out.println(stack.pop());

		// 3- Hashtable
		// Hashtable<String, Integer> table = new Hashtable<>();
		// table.put("c", 12);
		// table.put("a", 50);
		// table.put("b", 60);
		// table.put("c", 34);
		// System.out.println(table.get("c"));

		// Enumeration
		// Vector<Integer> v = new Vector<>();
		//
		// for(int x=0;x<=85;x++) {
		// v.add(x);
		// }
		// Enumeration<Integer> enumeration= v.elements();
		// while(enumeration.hasMoreElements()) {
		// System.out.println(enumeration.nextElement());
		// }
		// Hashtable<String, Integer> table = new Hashtable<>();
		// table.put("c", 12);
		// table.put("a", 50);
		// table.put("b", 60);
		// table.put("c", 34);
		// Set<String>keys= table.keySet();
		// for(String key : keys) {
		// System.out.println(table.get(key));
		// }

		// Enumeration<Integer> enumeration= table.elements();
		// while(enumeration.hasMoreElements())
		// System.out.println(enumeration.nextElement());

		// BitSet bitset= new BitSet();
		// bitset.set(0);
		// bitset.set(2);
		// BitSet bitSet2= new BitSet();
		// bitSet2.set(0);
		// bitSet2.set(1);
		//
		// bitset.or(bitSet2);
		//
		// System.out.println(bitset);

		// Collection 1.2
		// List
		// Map
		// Set
		// HashSet<Integer> set = new HashSet<>();
		// set.add(3);
		// set.add(4);
		// set.add(3);
		// System.out.println(set);
		// HashMap<Integer, Integer> map = new HashMap<>();
		// map.put(null, 3);
		// map.put(2, 18);
		// System.out.println(map.get(null));
		// FIFO
//		 ArrayList<Integer> li = new ArrayList<>();
//		 li.add(44);
//		 li.add(55);
//		 ArrayList<Integer> list = new ArrayList<>();
//		 list.add(1);
//		 list.add(2);
//		 list.add(new Integer(4));
//		 list.addAll(li);
//		 Iterator<Integer> iterator= list.iterator();
//		 while(iterator.hasNext()) {
//			 System.out.println(iterator.next());
//		 }
		// System.out.println(list);
		// list.clear();
		// list.remove(3)
		// list.contains(2);
		// System.out.println(list.indexOf(1));
		// LinkedList<Integer> li= new LinkedList<>();
		// li.push(8);
		// li.push(4);
		// li.push(6);
		// System.out.println(li);
		// System.out.println(li.poll());
		// System.out.println(li.poll());

	}
}
