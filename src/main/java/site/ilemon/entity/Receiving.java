package site.ilemon.entity;

public class Receiving {

	private int id;
	
	private int receivingId;
	
	private String receivingName;
	
	private String receivingAddress;
	
	private int userId;
	
	private String creatTime;
	private String updateTime;
	public Receiving() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReceivingId() {
		return receivingId;
	}
	public void setReceivingId(int receivingId) {
		this.receivingId = receivingId;
	}
	public String getReceivingName() {
		return receivingName;
	}
	public void setReceivingName(String receivingName) {
		this.receivingName = receivingName;
	}
	public String getReceivingAddress() {
		return receivingAddress;
	}
	public void setReceivingAddress(String receivingAddress) {
		this.receivingAddress = receivingAddress;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(String creatTime) {
		this.creatTime = creatTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
}
