<?php
// automatically generated by the FlatBuffers compiler, do not modify

namespace Testing\KeySearch;

use \Google\FlatBuffers\Struct;
use \Google\FlatBuffers\Table;
use \Google\FlatBuffers\ByteBuffer;
use \Google\FlatBuffers\FlatBufferBuilder;

class LongEntry extends Table
{
    /**
     * @param ByteBuffer $bb
     * @return LongEntry
     */
    public static function getRootAsLongEntry(ByteBuffer $bb)
    {
        $obj = new LongEntry();
        return ($obj->init($bb->getInt($bb->getPosition()) + $bb->getPosition(), $bb));
    }

    public static function LongEntryIdentifier()
    {
        return "FBMD";
    }

    public static function LongEntryBufferHasIdentifier(ByteBuffer $buf)
    {
        return self::__has_identifier($buf, self::LongEntryIdentifier());
    }

    public static function LongEntryExtension()
    {
        return "mdict";
    }

    /**
     * @param int $_i offset
     * @param ByteBuffer $_bb
     * @return LongEntry
     **/
    public function init($_i, ByteBuffer $_bb)
    {
        $this->bb_pos = $_i;
        $this->bb = $_bb;
        return $this;
    }

    /**
     * @return long
     */
    public function getKey()
    {
        $o = $this->__offset(4);
        return $o != 0 ? $this->bb->getLong($o + $this->bb_pos) : 0;
    }

    /**
     * @return long
     */
    public function getValue()
    {
        $o = $this->__offset(6);
        return $o != 0 ? $this->bb->getLong($o + $this->bb_pos) : -9223372036854775808;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return void
     */
    public static function startLongEntry(FlatBufferBuilder $builder)
    {
        $builder->StartObject(2);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return LongEntry
     */
    public static function createLongEntry(FlatBufferBuilder $builder, $key, $value)
    {
        $builder->startObject(2);
        self::addKey($builder, $key);
        self::addValue($builder, $value);
        $o = $builder->endObject();
        return $o;
    }

    /**
     * @param FlatBufferBuilder $builder
     * @param long
     * @return void
     */
    public static function addKey(FlatBufferBuilder $builder, $key)
    {
        $builder->addLongX(0, $key, 0);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @param long
     * @return void
     */
    public static function addValue(FlatBufferBuilder $builder, $value)
    {
        $builder->addLongX(1, $value, -9223372036854775808);
    }

    /**
     * @param FlatBufferBuilder $builder
     * @return int table offset
     */
    public static function endLongEntry(FlatBufferBuilder $builder)
    {
        $o = $builder->endObject();
        return $o;
    }
}