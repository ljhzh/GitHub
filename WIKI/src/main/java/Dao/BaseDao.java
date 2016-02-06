package Dao;

import java.util.List;

public interface BaseDao {
	
	public void save(Object o);
	public void update(Object o);
	public void saveAndUpdate(Object o);
	public Object get(Integer id);
	public List<Object> list();
	public List<Object> downlist();
	public List<Object> uplist();
	public Integer getClassId(Object o);
	public String getClassString(Object o,Integer index);
	
}
