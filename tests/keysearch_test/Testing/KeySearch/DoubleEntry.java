// automatically generated by the FlatBuffers compiler, do not modify

package Testing.KeySearch;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class DoubleEntry extends Table {
  public static DoubleEntry getRootAsDoubleEntry(ByteBuffer _bb) { return getRootAsDoubleEntry(_bb, new DoubleEntry()); }
  public static DoubleEntry getRootAsDoubleEntry(ByteBuffer _bb, DoubleEntry obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public DoubleEntry __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public double key() { int o = __offset(4); return o != 0 ? bb.getDouble(o + bb_pos) : 0.0; }
  public boolean mutateKey(double key) { int o = __offset(4); if (o != 0) { bb.putDouble(o + bb_pos, key); return true; } else { return false; } }
  public double value() { int o = __offset(6); return o != 0 ? bb.getDouble(o + bb_pos) : 4567.0; }
  public boolean mutateValue(double value) { int o = __offset(6); if (o != 0) { bb.putDouble(o + bb_pos, value); return true; } else { return false; } }

  public static int createDoubleEntry(FlatBufferBuilder builder,
      double key,
      double value) {
    builder.startObject(2);
    DoubleEntry.addValue(builder, value);
    DoubleEntry.addKey(builder, key);
    return DoubleEntry.endDoubleEntry(builder);
  }

  public static void startDoubleEntry(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addKey(FlatBufferBuilder builder, double key) { builder.addDouble(0, key, 0.0); }
  public static void addValue(FlatBufferBuilder builder, double value) { builder.addDouble(1, value, 4567.0); }
  public static int endDoubleEntry(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }

  @Override
  protected int keysCompare(Integer o1, Integer o2, ByteBuffer _bb) {
    double val_1 = _bb.getDouble(o1+__offset(4, o1, _bb));
    double val_2 = _bb.getDouble(o2+__offset(4, o2, _bb));
    return val_1 > val_2 ? 1 : val_1 < val_2 ? -1 : 0;
  }
}
