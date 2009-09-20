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

#include "JSAttr.h"

#include <wtf/GetPtr.h>

#include "Attr.h"
#include "CSSMutableStyleDeclaration.h"
#include "CSSStyleDeclaration.h"
#include "Element.h"
#include "JSCSSStyleDeclaration.h"
#include "JSElement.h"
#include "KURL.h"

#include <runtime/JSNumberCell.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSAttr)

/* Hash table */

static const HashTableValue JSAttrTableValues[7] =
{
    { "name", DontDelete|ReadOnly, (intptr_t)jsAttrName, (intptr_t)0 },
    { "specified", DontDelete|ReadOnly, (intptr_t)jsAttrSpecified, (intptr_t)0 },
    { "value", DontDelete, (intptr_t)jsAttrValue, (intptr_t)setJSAttrValue },
    { "ownerElement", DontDelete|ReadOnly, (intptr_t)jsAttrOwnerElement, (intptr_t)0 },
    { "style", DontDelete|ReadOnly, (intptr_t)jsAttrStyle, (intptr_t)0 },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsAttrConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSAttrTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 127, JSAttrTableValues, 0 };
#else
    { 18, 15, JSAttrTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSAttrConstructorTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSAttrConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSAttrConstructorTableValues, 0 };
#else
    { 1, 0, JSAttrConstructorTableValues, 0 };
#endif

class JSAttrConstructor : public DOMObject {
public:
    JSAttrConstructor(ExecState* exec)
        : DOMObject(JSAttrConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSAttrPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSAttrConstructor::s_info = { "AttrConstructor", 0, &JSAttrConstructorTable, 0 };

bool JSAttrConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSAttrConstructor, DOMObject>(exec, &JSAttrConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSAttrPrototypeTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSAttrPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSAttrPrototypeTableValues, 0 };
#else
    { 1, 0, JSAttrPrototypeTableValues, 0 };
#endif

const ClassInfo JSAttrPrototype::s_info = { "AttrPrototype", 0, &JSAttrPrototypeTable, 0 };

JSObject* JSAttrPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSAttr>(exec);
}

const ClassInfo JSAttr::s_info = { "Attr", &JSEventTargetNode::s_info, &JSAttrTable, 0 };

JSAttr::JSAttr(PassRefPtr<Structure> structure, PassRefPtr<Attr> impl)
    : JSEventTargetNode(structure, impl)
{
}

JSObject* JSAttr::createPrototype(ExecState* exec)
{
    return new (exec) JSAttrPrototype(JSAttrPrototype::createStructure(JSEventTargetNodePrototype::self(exec)));
}

bool JSAttr::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSAttr, Base>(exec, &JSAttrTable, this, propertyName, slot);
}

JSValuePtr jsAttrName(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    Attr* imp = static_cast<Attr*>(static_cast<JSAttr*>(asObject(slot.slotBase()))->impl());
    return jsStringOrNull(exec, imp->name());
}

JSValuePtr jsAttrSpecified(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    Attr* imp = static_cast<Attr*>(static_cast<JSAttr*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->specified());
}

JSValuePtr jsAttrValue(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    Attr* imp = static_cast<Attr*>(static_cast<JSAttr*>(asObject(slot.slotBase()))->impl());
    return jsStringOrNull(exec, imp->value());
}

JSValuePtr jsAttrOwnerElement(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    Attr* imp = static_cast<Attr*>(static_cast<JSAttr*>(asObject(slot.slotBase()))->impl());
    return toJS(exec, WTF::getPtr(imp->ownerElement()));
}

JSValuePtr jsAttrStyle(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    Attr* imp = static_cast<Attr*>(static_cast<JSAttr*>(asObject(slot.slotBase()))->impl());
    return toJS(exec, WTF::getPtr(imp->style()));
}

JSValuePtr jsAttrConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSAttr*>(asObject(slot.slotBase()))->getConstructor(exec);
}
void JSAttr::put(ExecState* exec, const Identifier& propertyName, JSValuePtr value, PutPropertySlot& slot)
{
    lookupPut<JSAttr, Base>(exec, propertyName, value, &JSAttrTable, this, slot);
}

void setJSAttrValue(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    static_cast<JSAttr*>(thisObject)->setValue(exec, value);
}

JSValuePtr JSAttr::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSAttrConstructor>(exec);
}

Attr* toAttr(JSC::JSValuePtr value)
{
    return value.isObject(&JSAttr::s_info) ? static_cast<JSAttr*>(asObject(value))->impl() : 0;
}

}
