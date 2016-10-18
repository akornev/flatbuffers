<?php
// automatically generated by the FlatBuffers compiler, do not modify

namespace Testing\KeySearch;

use \Google\FlatBuffers\Struct;
use \Google\FlatBuffers\Table;
use \Google\FlatBuffers\ByteBuffer;
use \Google\FlatBuffers\FlatBufferBuilder;

class UByteEntry extends Table
{
    /**
     * @param ByteBuffer $bb
     * @return UByteEntry
     */
    public static function getRootAsUByteEntry(ByteBuffer $bb)
    {
        $obj = new UByteEntry();
        return ($obj->init($bb->getInt($bb->getPosition()) + $bb->getPosition(), $bb));
    }

    public static function UByteEntryIdentifier()
    {
        return "FBMD";
    }

    public static function UByteEntryBufferHasIdentifier(ByteBuffer $buf)
    {
        return self::__has_identifier($buf, self::UByteEntryIdentifier());
    }

    public static function UByteEntryExtension()
    {
        return "mdict";
    }

    /**
     * @param int $_i offset
     * @param ByteBuffer $_bb
     * @return UByteEntry
     **/
    public function init($_i, ByteBuffer $_bb)
    {
        $this->bb_pos = $_i;
        $this->bb = $_bb;
        return $this;
    }

    /**
     * @return byte
     */
    public function getKey()
    {
        $o = $this->__offset(4);
        return $o != 0 ? $this->bb->getByte($o + $this->bb_pos) : 0;
    }

    /**
     * @return byte
     */
    public function getValue()
    {
        $o = $this->__offset(6);
        return $o != 0 ? $this->bb->getByte($o + $this->bb_pos) : 255;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return void
     */
    public static function startUByteEntry(FlatBufferBuilder $builder)
    {
        $builder->StartObject(2);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return UByteEntry
     */
    public static function createUByteEntry(FlatBufferBuilder $builder, $key, $value)
    {
        $builder->startObject(2);
        self::addKey($builder, $key);
        self::addValue($builder, $value);
        $o = $builder->endObject();
        return $o;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @param byte
     * @return void
     */
    public static function addKey(FlatBufferBuilder $builder, $key)
    {
        $builder->addByteX(0, $key, 0);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @param byte
     * @return void
     */
    public static function addValue(FlatBufferBuilder $builder, $value)
    {
        $builder->addByteX(1, $value, 255);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return int table offset
     */
    public static function endUByteEntry(FlatBufferBuilder $builder)
    {
        $o = $builder->endObject();
        return $o;
    }
}