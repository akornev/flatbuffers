// automatically generated by the FlatBuffers compiler, do not modify

package KeySearch

import (
	flatbuffers "github.com/google/flatbuffers/go"
)

type ByteEntry struct {
	_tab flatbuffers.Table
}

func GetRootAsByteEntry(buf []byte, offset flatbuffers.UOffsetT) *ByteEntry {
	n := flatbuffers.GetUOffsetT(buf[offset:])
	x := &ByteEntry{}
	x.Init(buf, n+offset)
	return x
}

func (rcv *ByteEntry) Init(buf []byte, i flatbuffers.UOffsetT) {
	rcv._tab.Bytes = buf
	rcv._tab.Pos = i
}

func (rcv *ByteEntry) Key() int8 {
	o := flatbuffers.UOffsetT(rcv._tab.Offset(4))
	if o != 0 {
		return rcv._tab.GetInt8(o + rcv._tab.Pos)
	}
	return -128
}

func (rcv *ByteEntry) MutateKey(n int8) bool {
	return rcv._tab.MutateInt8Slot(4, n)
}

func (rcv *ByteEntry) Value() int8 {
	o := flatbuffers.UOffsetT(rcv._tab.Offset(6))
	if o != 0 {
		return rcv._tab.GetInt8(o + rcv._tab.Pos)
	}
	return -128
}

func (rcv *ByteEntry) MutateValue(n int8) bool {
	return rcv._tab.MutateInt8Slot(6, n)
}

func ByteEntryStart(builder *flatbuffers.Builder) {
	builder.StartObject(2)
}
func ByteEntryAddKey(builder *flatbuffers.Builder, key int8) {
	builder.PrependInt8Slot(0, key, -128)
}
func ByteEntryAddValue(builder *flatbuffers.Builder, value int8) {
	builder.PrependInt8Slot(1, value, -128)
}
func ByteEntryEnd(builder *flatbuffers.Builder) flatbuffers.UOffsetT {
	return builder.EndObject()
}