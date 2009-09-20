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

#include "JSHTMLHRElement.h"

#include <wtf/GetPtr.h>

#include "HTMLHRElement.h"
#include "KURL.h"

#include <runtime/JSNumberCell.h>
#include <runtime/JSString.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSHTMLHRElement)

/* Hash table */

static const HashTableValue JSHTMLHRElementTableValues[6] =
{
    { "align", DontDelete, (intptr_t)jsHTMLHRElementAlign, (intptr_t)setJSHTMLHRElementAlign },
    { "noShade", DontDelete, (intptr_t)jsHTMLHRElementNoShade, (intptr_t)setJSHTMLHRElementNoShade },
    { "size", DontDelete, (intptr_t)jsHTMLHRElementSize, (intptr_t)setJSHTMLHRElementSize },
    { "width", DontDelete, (intptr_t)jsHTMLHRElementWidth, (intptr_t)setJSHTMLHRElementWidth },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsHTMLHRElementConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLHRElementTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 31, JSHTMLHRElementTableValues, 0 };
#else
    { 17, 15, JSHTMLHRElementTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSHTMLHRElementConstructorTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLHRElementConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSHTMLHRElementConstructorTableValues, 0 };
#else
    { 1, 0, JSHTMLHRElementConstructorTableValues, 0 };
#endif

class JSHTMLHRElementConstructor : public DOMObject {
public:
    JSHTMLHRElementConstructor(ExecState* exec)
        : DOMObject(JSHTMLHRElementConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSHTMLHRElementPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSHTMLHRElementConstructor::s_info = { "HTMLHRElementConstructor", 0, &JSHTMLHRElementConstructorTable, 0 };

bool JSHTMLHRElementConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSHTMLHRElementConstructor, DOMObject>(exec, &JSHTMLHRElementConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSHTMLHRElementPrototypeTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLHRElementPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSHTMLHRElementPrototypeTableValues, 0 };
#else
    { 1, 0, JSHTMLHRElementPrototypeTableValues, 0 };
#endif

const ClassInfo JSHTMLHRElementPrototype::s_info = { "HTMLHRElementPrototype", 0, &JSHTMLHRElementPrototypeTable, 0 };

JSObject* JSHTMLHRElementPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSHTMLHRElement>(exec);
}

const ClassInfo JSHTMLHRElement::s_info = { "HTMLHRElement", &JSHTMLElement::s_info, &JSHTMLHRElementTable, 0 };

JSHTMLHRElement::JSHTMLHRElement(PassRefPtr<Structure> structure, PassRefPtr<HTMLHRElement> impl)
    : JSHTMLElement(structure, impl)
{
}

JSObject* JSHTMLHRElement::createPrototype(ExecState* exec)
{
    return new (exec) JSHTMLHRElementPrototype(JSHTMLHRElementPrototype::createStructure(JSHTMLElementPrototype::self(exec)));
}

bool JSHTMLHRElement::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSHTMLHRElement, Base>(exec, &JSHTMLHRElementTable, this, propertyName, slot);
}

JSValuePtr jsHTMLHRElementAlign(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLHRElement* imp = static_cast<HTMLHRElement*>(static_cast<JSHTMLHRElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->align());
}

JSValuePtr jsHTMLHRElementNoShade(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLHRElement* imp = static_cast<HTMLHRElement*>(static_cast<JSHTMLHRElement*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->noShade());
}

JSValuePtr jsHTMLHRElementSize(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLHRElement* imp = static_cast<HTMLHRElement*>(static_cast<JSHTMLHRElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->size());
}

JSValuePtr jsHTMLHRElementWidth(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLHRElement* imp = static_cast<HTMLHRElement*>(static_cast<JSHTMLHRElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->width());
}

JSValuePtr jsHTMLHRElementConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSHTMLHRElement*>(asObject(slot.slotBase()))->getConstructor(exec);
}
void JSHTMLHRElement::put(ExecState* exec, const Identifier& propertyName, JSValuePtr value, PutPropertySlot& slot)
{
    lookupPut<JSHTMLHRElement, Base>(exec, propertyName, value, &JSHTMLHRElementTable, this, slot);
}

void setJSHTMLHRElementAlign(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLHRElement* imp = static_cast<HTMLHRElement*>(static_cast<JSHTMLHRElement*>(thisObject)->impl());
    imp->setAlign(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLHRElementNoShade(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLHRElement* imp = static_cast<HTMLHRElement*>(static_cast<JSHTMLHRElement*>(thisObject)->impl());
    imp->setNoShade(value.toBoolean(exec));
}

void setJSHTMLHRElementSize(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLHRElement* imp = static_cast<HTMLHRElement*>(static_cast<JSHTMLHRElement*>(thisObject)->impl());
    imp->setSize(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLHRElementWidth(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLHRElement* imp = static_cast<HTMLHRElement*>(static_cast<JSHTMLHRElement*>(thisObject)->impl());
    imp->setWidth(valueToStringWithNullCheck(exec, value));
}

JSValuePtr JSHTMLHRElement::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSHTMLHRElementConstructor>(exec);
}


}