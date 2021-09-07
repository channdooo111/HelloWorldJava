import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;
public class CollectionDemo {

	public static void main(String[] args) {
		
		List values = new ArrayList();
		values.add(4);
		values.add(6);
		values.add(9);
		values.add(3,3);
		
		Collections.sort(values);
		Collections.reverse(values);
		Collections.shuffle(values);
		
		for(int i=0; i<values.size();i++)
		{
			System.out.println(values.get(i));
		}

	}

}
