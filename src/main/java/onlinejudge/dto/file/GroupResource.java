package onlinejudge.dto.file;

import java.util.ArrayList;
import java.util.List;

public class GroupResource {
	private List<MyResource> listResource;
	
	public void add(MyResource resource){
		this.getListResource().add(resource);
	}
	
	public List<MyResource> getListResource() {
		if(listResource == null)
			listResource = new ArrayList<MyResource>();
		return listResource;
	}

	public void setListResource(List<MyResource> listResource) {
		this.listResource = listResource;
	}
	
}
