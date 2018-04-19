package boards.models.org;

import org.bson.types.ObjectId;

import com.google.gson.annotations.Expose;

public abstract class Model {
	@Expose
	protected ObjectId _id;

	public Model() {
		this(null);
	}

	public Model(ObjectId id) {
		this._id = id;
	}
}
