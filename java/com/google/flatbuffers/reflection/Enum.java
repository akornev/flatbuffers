// automatically generated by the FlatBuffers compiler, do not modify

package com.google.flatbuffers.reflection;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Enum extends Table {
  public static Enum getRootAsEnum(ByteBuffer _bb) { return getRootAsEnum(_bb, new Enum()); }
  public static Enum getRootAsEnum(ByteBuffer _bb, Enum obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public Enum __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String name() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public EnumVal values(int j) { return values(new EnumVal(), j); }
  public EnumVal values(EnumVal obj, int j) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int valuesLength() { int o = __offset(6); return o != 0 ? __vector_len(o) : 0; }
  public EnumVal valuesByKey( long key ) { int vectorOffset = __vector(__offset(6)) - 4; return vectorOffset != 0 ? EnumVal.lookupByKey(bb.array().length - vectorOffset, key, bb) : null;  }
  public boolean isUnion() { int o = __offset(8); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean mutateIsUnion(boolean is_union) { int o = __offset(8); if (o != 0) { bb.put(o + bb_pos, (byte)(is_union ? 1 : 0)); return true; } else { return false; } }
  public Type underlyingType() { return underlyingType(new Type()); }
  public Type underlyingType(Type obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public KeyValue attributes(int j) { return attributes(new KeyValue(), j); }
  public KeyValue attributes(KeyValue obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int attributesLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public KeyValue attributesByKey( String key ) { int vectorOffset = __vector(__offset(12)) - 4; return vectorOffset != 0 ? KeyValue.lookupByKey(bb.array().length - vectorOffset, key, bb) : null;  }

  public static int createEnum(FlatBufferBuilder builder,
      int nameOffset,
      int valuesOffset,
      boolean is_union,
      int underlying_typeOffset,
      int attributesOffset) {
    builder.startObject(5);
    Enum.addAttributes(builder, attributesOffset);
    Enum.addUnderlyingType(builder, underlying_typeOffset);
    Enum.addValues(builder, valuesOffset);
    Enum.addName(builder, nameOffset);
    Enum.addIsUnion(builder, is_union);
    return Enum.endEnum(builder);
  }

  public static void startEnum(FlatBufferBuilder builder) { builder.startObject(5); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(0, nameOffset, 0); }
  public static void addValues(FlatBufferBuilder builder, int valuesOffset) { builder.addOffset(1, valuesOffset, 0); }
  public static int createValuesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startValuesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addIsUnion(FlatBufferBuilder builder, boolean isUnion) { builder.addBoolean(2, isUnion, false); }
  public static void addUnderlyingType(FlatBufferBuilder builder, int underlyingTypeOffset) { builder.addOffset(3, underlyingTypeOffset, 0); }
  public static void addAttributes(FlatBufferBuilder builder, int attributesOffset) { builder.addOffset(4, attributesOffset, 0); }
  public static int createAttributesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startAttributesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endEnum(FlatBufferBuilder builder) {
    int o = builder.endObject();
    builder.required(o, 4);  // name
    builder.required(o, 6);  // values
    builder.required(o, 10);  // underlying_type
    return o;
  }

  @Override
  protected int keysCompare(Integer o1, Integer o2, ByteBuffer _bb) { return compareStrings(__offset(4, o1, _bb), __offset(4, o2, _bb), _bb); }

  public static Enum lookupByKey(int vectorOffset, String key, ByteBuffer bb) {
    byte[] byteKey = key.getBytes(Table.UTF8_CHARSET.get());
    int vectorLocation = bb.array().length - vectorOffset;
    int span = bb.getInt(vectorLocation);
    int start = 0;
    vectorLocation += 4;
    while (span != 0) {
      int middle = span / 2;
      int tableOffset = __indirect(vectorLocation + 4 * (start + middle), bb);
      int comp = compareStrings(__offset(4, bb.array().length - tableOffset, bb), byteKey, bb);
      if (comp > 0) {
        span = middle;
      } else if (comp < 0) {
        middle++;
        start += middle;
        span -= middle;
      } else {
        return new Enum().__assign(tableOffset, bb);
      }
    }
    return null;
  }
}

