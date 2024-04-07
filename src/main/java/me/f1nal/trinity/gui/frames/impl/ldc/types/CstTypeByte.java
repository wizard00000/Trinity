package me.f1nal.trinity.gui.frames.impl.ldc.types;

import imgui.flag.ImGuiDataType;
import me.f1nal.trinity.gui.frames.impl.assembler.popup.edit.EditFieldInteger;
import me.f1nal.trinity.gui.frames.impl.ldc.CstType;

public class CstTypeByte extends CstType<Byte> {
    public CstTypeByte() {
        super("Byte");
        this.addField(new EditFieldInteger("Value", () -> Integer.valueOf(getValue()), (val) -> {
            this.setValue(val.byteValue());
        }, ImGuiDataType.S8));
    }
}
