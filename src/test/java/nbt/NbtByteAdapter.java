package nbt;

import nl.appelgebakje22.xdata.adapter.BaseByteAdapter;
import nl.appelgebakje22.xdata.adapter.BooleanAdapter;

class NbtByteAdapter extends BaseByteAdapter implements BooleanAdapter {

	@Override
	public void setBoolean(boolean value) {
		this.setNumber((byte) (value ? 1 : 0));
	}

	@Override
	public boolean getBoolean() {
		return this.getByte() != 0;
	}

	@Override
	public boolean getBoolean(boolean fallback) {
		return this.getBoolean() || fallback;
	}
}
