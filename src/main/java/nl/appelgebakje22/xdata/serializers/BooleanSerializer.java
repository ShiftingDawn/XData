package nl.appelgebakje22.xdata.serializers;

import nl.appelgebakje22.xdata.XData;
import nl.appelgebakje22.xdata.adapter.AdapterFactory;
import nl.appelgebakje22.xdata.adapter.BaseAdapter;
import nl.appelgebakje22.xdata.adapter.BooleanAdapter;
import nl.appelgebakje22.xdata.api.SimpleSerializer;
import org.jetbrains.annotations.Nullable;

public class BooleanSerializer extends SimpleSerializer<Boolean> {

	@Override
	public @Nullable BaseAdapter serialize(AdapterFactory adapters) {
		return adapters.ofBoolean(getData());
	}

	@Override
	public void deserialize(AdapterFactory adapters, BaseAdapter adapter) {
		BooleanAdapter booleanAdapter = this.testAdapter(adapter, BooleanAdapter.class);
		setData(booleanAdapter.getBoolean());
	}

	public static BooleanSerializer of(boolean data) {
		return XData.make(new BooleanSerializer(), serializer -> serializer.setData(data));
	}
}
