package privates.lzh.rpc.web.consumer.controller;

public class ServerResponse<D>
{
    // 返回码 0成功, 默认成功
    private String id = "0";
    
    // 描述
    private String desc;

    // 返回数据
    private D data;
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public D getData()
    {
        return data;
    }

    public void setData(D data)
    {
        this.data = data;
    }
}
