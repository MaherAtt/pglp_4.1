package uvsq.pglp_4_1_;

import java.util.ArrayList;
import java.util.Iterator;

public class AffichageGroup {

	ArrayList<GroupPersonnels> grp=new ArrayList<GroupPersonnels>();
	GroupPersonnels groupedepers;
	public AffichageGroup(GroupPersonnels prem)
	{
		groupedepers=prem;
	}
	
	public Iterator iterator()
	{
		return new GrpIterator();
	}
	
	private class GrpIterator implements Iterator {
		int index;

		public GrpIterator()
		{
			int verif=0;
			while(verif<=grp.size())
			{ 	
				grp.add(groupedepers);
				verif++;
			if(groupedepers instanceof CompositePersonnels)
			for(int i=0;i<((CompositePersonnels) groupedepers).personnes.size();i++)
			{
				grp.add(((CompositePersonnels) groupedepers).personnes.get(i));
			}
			}
			
		}
		public boolean hasNext() {
			if(index>=grp.size())
			return false; else return true;
		}

		public Object next() {
			return grp.get(index++);
		}
		
		
	}
	
}
