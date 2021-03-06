// automatically generated by the FlatBuffers compiler, do not modify

namespace Testing.KeySearch
{

using System;
using FlatBuffers;

public struct UShortEntry : IFlatbufferObject
{
  private Table __p;
  public ByteBuffer ByteBuffer { get { return __p.bb; } }
  public static UShortEntry GetRootAsUShortEntry(ByteBuffer _bb) { return GetRootAsUShortEntry(_bb, new UShortEntry()); }
  public static UShortEntry GetRootAsUShortEntry(ByteBuffer _bb, UShortEntry obj) { return (obj.__assign(_bb.GetInt(_bb.Position) + _bb.Position, _bb)); }
  public UShortEntry __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public ushort Key { get { int o = __p.__offset(4); return o != 0 ? __p.bb.GetUshort(o + __p.bb_pos) : (ushort)0; } }
  public bool MutateKey(ushort key) { int o = __p.__offset(4); if (o != 0) { __p.bb.PutUshort(o + __p.bb_pos, key); return true; } else { return false; } }
  public ushort Value { get { int o = __p.__offset(6); return o != 0 ? __p.bb.GetUshort(o + __p.bb_pos) : (ushort)65535; } }
  public bool MutateValue(ushort value) { int o = __p.__offset(6); if (o != 0) { __p.bb.PutUshort(o + __p.bb_pos, value); return true; } else { return false; } }

  public static Offset<UShortEntry> CreateUShortEntry(FlatBufferBuilder builder,
      ushort key = 0,
      ushort value = 65535) {
    builder.StartObject(2);
    UShortEntry.AddValue(builder, value);
    UShortEntry.AddKey(builder, key);
    return UShortEntry.EndUShortEntry(builder);
  }

  public static void StartUShortEntry(FlatBufferBuilder builder) { builder.StartObject(2); }
  public static void AddKey(FlatBufferBuilder builder, ushort key) { builder.AddUshort(0, key, 0); }
  public static void AddValue(FlatBufferBuilder builder, ushort value) { builder.AddUshort(1, value, 65535); }
  public static Offset<UShortEntry> EndUShortEntry(FlatBufferBuilder builder) {
    int o = builder.EndObject();
    return new Offset<UShortEntry>(o);
  }

  public static VectorOffset CreateMySortedVectorOfTables(FlatBufferBuilder builder, Offset<UShortEntry>[] offsets) {
    Array.Sort(offsets, (Offset<UShortEntry> o1, Offset<UShortEntry> o2) => builder.DataBufferp.bb.GetUshort(Table.__offset(4, o1.Value, builder.DataBuffer)).CompareTo(builder.DataBufferp.bb.GetUshort(Table.__offset(4, o2.Value, builder.DataBuffer))));
    return builder.CreateVectorOfTables(offsets);
  }

  public static UShortEntry? LookupByKey( int bb_pos, VectorOffset fieldDataOffset, ushort key, ushort defaultKeyValue , ByteBuffer bb) {
    int vectorLocation = bb.Length - vectorOffset.Value;
    int span = bb.GetInt(vectorLocation);
    vectorLocation += 4;
    int start = 0;
    while (span != 0) {
      int middle = span / 2;
      int tableOffset = Table.__indirect(vectorLocation + 4 * (start + middle), bb);
      int comp = __p.bb.GetUshort(Table.__offset(4, bb.Length - tableOffset, bb)).CompareTo(key);
      if (comp > 0) {
        span = middle;
      } else if (comp < 0) {
        middle++;
        start += middle;
        span -= middle;
      } else {
        return new UShortEntry().__assign(tableOffset, bb);
      }
    }
    return null;
  }
};


}
