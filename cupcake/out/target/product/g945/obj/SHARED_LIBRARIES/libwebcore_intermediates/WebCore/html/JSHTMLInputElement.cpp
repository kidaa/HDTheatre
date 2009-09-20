/*
    This file is part of the WebKit open source project.
    This file has been generated by generate-bindings.pl. DO NOT MODIFY!

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Library General Public
    License as published by the Free Software Foundation; either
    version 2 of the License, or (at your option) any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    Library General Public License for more details.

    You should have received a copy of the GNU Library General Public License
    along with this library; see the file COPYING.LIB.  If not, write to
    the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
    Boston, MA 02110-1301, USA.
*/

#include "config.h"

#include "JSHTMLInputElement.h"

#include <wtf/GetPtr.h>

#include "FileList.h"
#include "HTMLFormElement.h"
#include "HTMLInputElement.h"
#include "JSFileList.h"
#include "JSHTMLFormElement.h"
#include "KURL.h"

#include <runtime/Error.h>
#include <runtime/JSNumberCell.h>
#include <runtime/JSString.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSHTMLInputElement)

/* Hash table */

static const HashTableValue JSHTMLInputElementTableValues[25] =
{
    { "defaultValue", DontDelete, (intptr_t)jsHTMLInputElementDefaultValue, (intptr_t)setJSHTMLInputElementDefaultValue },
    { "defaultChecked", DontDelete, (intptr_t)jsHTMLInputElementDefaultChecked, (intptr_t)setJSHTMLInputElementDefaultChecked },
    { "form", DontDelete|ReadOnly, (intptr_t)jsHTMLInputElementForm, (intptr_t)0 },
    { "accept", DontDelete, (intptr_t)jsHTMLInputElementAccept, (intptr_t)setJSHTMLInputElementAccept },
    { "accessKey", DontDelete, (intptr_t)jsHTMLInputElementAccessKey, (intptr_t)setJSHTMLInputElementAccessKey },
    { "align", DontDelete, (intptr_t)jsHTMLInputElementAlign, (intptr_t)setJSHTMLInputElementAlign },
    { "alt", DontDelete, (intptr_t)jsHTMLInputElementAlt, (intptr_t)setJSHTMLInputElementAlt },
    { "checked", DontDelete, (intptr_t)jsHTMLInputElementChecked, (intptr_t)setJSHTMLInputElementChecked },
    { "disabled", DontDelete, (intptr_t)jsHTMLInputElementDisabled, (intptr_t)setJSHTMLInputElementDisabled },
    { "autofocus", DontDelete, (intptr_t)jsHTMLInputElementAutofocus, (intptr_t)setJSHTMLInputElementAutofocus },
    { "maxLength", DontDelete, (intptr_t)jsHTMLInputElementMaxLength, (intptr_t)setJSHTMLInputElementMaxLength },
    { "name", DontDelete, (intptr_t)jsHTMLInputElementName, (intptr_t)setJSHTMLInputElementName },
    { "readOnly", DontDelete, (intptr_t)jsHTMLInputElementReadOnly, (intptr_t)setJSHTMLInputElementReadOnly },
    { "size", DontDelete, (intptr_t)jsHTMLInputElementSize, (intptr_t)setJSHTMLInputElementSize },
    { "src", DontDelete, (intptr_t)jsHTMLInputElementSrc, (intptr_t)setJSHTMLInputElementSrc },
    { "type", DontDelete, (intptr_t)jsHTMLInputElementType, (intptr_t)setJSHTMLInputElementType },
    { "useMap", DontDelete, (intptr_t)jsHTMLInputElementUseMap, (intptr_t)setJSHTMLInputElementUseMap },
    { "value", DontDelete, (intptr_t)jsHTMLInputElementValue, (intptr_t)setJSHTMLInputElementValue },
    { "willValidate", DontDelete|ReadOnly, (intptr_t)jsHTMLInputElementWillValidate, (intptr_t)0 },
    { "indeterminate", DontDelete, (intptr_t)jsHTMLInputElementIndeterminate, (intptr_t)setJSHTMLInputElementIndeterminate },
    { "selectionStart", DontDelete, (intptr_t)jsHTMLInputElementSelectionStart, (intptr_t)setJSHTMLInputElementSelectionStart },
    { "selectionEnd", DontDelete, (intptr_t)jsHTMLInputElementSelectionEnd, (intptr_t)setJSHTMLInputElementSelectionEnd },
    { "files", DontDelete|ReadOnly, (intptr_t)jsHTMLInputElementFiles, (intptr_t)0 },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsHTMLInputElementConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLInputElementTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 255, JSHTMLInputElementTableValues, 0 };
#else
    { 69, 63, JSHTMLInputElementTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSHTMLInputElementConstructorTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLInputElementConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSHTMLInputElementConstructorTableValues, 0 };
#else
    { 1, 0, JSHTMLInputElementConstructorTableValues, 0 };
#endif

class JSHTMLInputElementConstructor : public DOMObject {
public:
    JSHTMLInputElementConstructor(ExecState* exec)
        : DOMObject(JSHTMLInputElementConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSHTMLInputElementPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSHTMLInputElementConstructor::s_info = { "HTMLInputElementConstructor", 0, &JSHTMLInputElementConstructorTable, 0 };

bool JSHTMLInputElementConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSHTMLInputElementConstructor, DOMObject>(exec, &JSHTMLInputElementConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSHTMLInputElementPrototypeTableValues[4] =
{
    { "select", DontDelete|Function, (intptr_t)jsHTMLInputElementPrototypeFunctionSelect, (intptr_t)0 },
    { "click", DontDelete|Function, (intptr_t)jsHTMLInputElementPrototypeFunctionClick, (intptr_t)0 },
    { "setSelectionRange", DontDelete|Function, (intptr_t)jsHTMLInputElementPrototypeFunctionSetSelectionRange, (intptr_t)2 },
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLInputElementPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 15, JSHTMLInputElementPrototypeTableValues, 0 };
#else
    { 9, 7, JSHTMLInputElementPrototypeTableValues, 0 };
#endif

const ClassInfo JSHTMLInputElementPrototype::s_info = { "HTMLInputElementPrototype", 0, &JSHTMLInputElementPrototypeTable, 0 };

JSObject* JSHTMLInputElementPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSHTMLInputElement>(exec);
}

bool JSHTMLInputElementPrototype::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticFunctionSlot<JSObject>(exec, &JSHTMLInputElementPrototypeTable, this, propertyName, slot);
}

const ClassInfo JSHTMLInputElement::s_info = { "HTMLInputElement", &JSHTMLElement::s_info, &JSHTMLInputElementTable, 0 };

JSHTMLInputElement::JSHTMLInputElement(PassRefPtr<Structure> structure, PassRefPtr<HTMLInputElement> impl)
    : JSHTMLElement(structure, impl)
{
}

JSObject* JSHTMLInputElement::createPrototype(ExecState* exec)
{
    return new (exec) JSHTMLInputElementPrototype(JSHTMLInputElementPrototype::createStructure(JSHTMLElementPrototype::self(exec)));
}

bool JSHTMLInputElement::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    if (customGetOwnPropertySlot(exec, propertyName, slot))
        return true;
    return getStaticValueSlot<JSHTMLInputElement, Base>(exec, &JSHTMLInputElementTable, this, propertyName, slot);
}

JSValuePtr jsHTMLInputElementDefaultValue(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->defaultValue());
}

JSValuePtr jsHTMLInputElementDefaultChecked(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->defaultChecked());
}

JSValuePtr jsHTMLInputElementForm(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return toJS(exec, WTF::getPtr(imp->form()));
}

JSValuePtr jsHTMLInputElementAccept(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->accept());
}

JSValuePtr jsHTMLInputElementAccessKey(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->accessKey());
}

JSValuePtr jsHTMLInputElementAlign(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->align());
}

JSValuePtr jsHTMLInputElementAlt(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->alt());
}

JSValuePtr jsHTMLInputElementChecked(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->checked());
}

JSValuePtr jsHTMLInputElementDisabled(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->disabled());
}

JSValuePtr jsHTMLInputElementAutofocus(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->autofocus());
}

JSValuePtr jsHTMLInputElementMaxLength(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->maxLength());
}

JSValuePtr jsHTMLInputElementName(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->name());
}

JSValuePtr jsHTMLInputElementReadOnly(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->readOnly());
}

JSValuePtr jsHTMLInputElementSize(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->size());
}

JSValuePtr jsHTMLInputElementSrc(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->src());
}

JSValuePtr jsHTMLInputElementType(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->type());
}

JSValuePtr jsHTMLInputElementUseMap(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->useMap());
}

JSValuePtr jsHTMLInputElementValue(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->value());
}

JSValuePtr jsHTMLInputElementWillValidate(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->willValidate());
}

JSValuePtr jsHTMLInputElementIndeterminate(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->indeterminate());
}

JSValuePtr jsHTMLInputElementSelectionStart(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->selectionStart(exec);
}

JSValuePtr jsHTMLInputElementSelectionEnd(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->selectionEnd(exec);
}

JSValuePtr jsHTMLInputElementFiles(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->impl());
    return toJS(exec, WTF::getPtr(imp->files()));
}

JSValuePtr jsHTMLInputElementConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSHTMLInputElement*>(asObject(slot.slotBase()))->getConstructor(exec);
}
void JSHTMLInputElement::put(ExecState* exec, const Identifier& propertyName, JSValuePtr value, PutPropertySlot& slot)
{
    lookupPut<JSHTMLInputElement, Base>(exec, propertyName, value, &JSHTMLInputElementTable, this, slot);
}

void setJSHTMLInputElementDefaultValue(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setDefaultValue(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLInputElementDefaultChecked(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setDefaultChecked(value.toBoolean(exec));
}

void setJSHTMLInputElementAccept(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setAccept(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLInputElementAccessKey(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setAccessKey(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLInputElementAlign(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setAlign(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLInputElementAlt(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setAlt(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLInputElementChecked(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setChecked(value.toBoolean(exec));
}

void setJSHTMLInputElementDisabled(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setDisabled(value.toBoolean(exec));
}

void setJSHTMLInputElementAutofocus(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setAutofocus(value.toBoolean(exec));
}

void setJSHTMLInputElementMaxLength(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setMaxLength(value.toInt32(exec));
}

void setJSHTMLInputElementName(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setName(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLInputElementReadOnly(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setReadOnly(value.toBoolean(exec));
}

void setJSHTMLInputElementSize(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setSize(value.toInt32(exec));
}

void setJSHTMLInputElementSrc(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setSrc(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLInputElementType(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setType(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLInputElementUseMap(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setUseMap(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLInputElementValue(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setValue(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLInputElementIndeterminate(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setIndeterminate(value.toBoolean(exec));
}

void setJSHTMLInputElementSelectionStart(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setSelectionStart(value.toInt32(exec));
}

void setJSHTMLInputElementSelectionEnd(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(static_cast<JSHTMLInputElement*>(thisObject)->impl());
    imp->setSelectionEnd(value.toInt32(exec));
}

JSValuePtr JSHTMLInputElement::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSHTMLInputElementConstructor>(exec);
}

JSValuePtr jsHTMLInputElementPrototypeFunctionSelect(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSHTMLInputElement::s_info))
        return throwError(exec, TypeError);
    JSHTMLInputElement* castedThisObj = static_cast<JSHTMLInputElement*>(asObject(thisValue));
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(castedThisObj->impl());

    imp->select();
    return jsUndefined();
}

JSValuePtr jsHTMLInputElementPrototypeFunctionClick(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSHTMLInputElement::s_info))
        return throwError(exec, TypeError);
    JSHTMLInputElement* castedThisObj = static_cast<JSHTMLInputElement*>(asObject(thisValue));
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(castedThisObj->impl());

    imp->click();
    return jsUndefined();
}

JSValuePtr jsHTMLInputElementPrototypeFunctionSetSelectionRange(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSHTMLInputElement::s_info))
        return throwError(exec, TypeError);
    JSHTMLInputElement* castedThisObj = static_cast<JSHTMLInputElement*>(asObject(thisValue));
    HTMLInputElement* imp = static_cast<HTMLInputElement*>(castedThisObj->impl());
    int start = args.at(exec, 0).toInt32(exec);
    int end = args.at(exec, 1).toInt32(exec);

    imp->setSelectionRange(start, end);
    return jsUndefined();
}


}