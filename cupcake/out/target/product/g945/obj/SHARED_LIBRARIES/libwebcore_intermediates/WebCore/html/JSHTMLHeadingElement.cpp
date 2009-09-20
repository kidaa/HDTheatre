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

#include "JSHTMLHeadingElement.h"

#include <wtf/GetPtr.h>

#include "HTMLHeadingElement.h"
#include "KURL.h"

#include <runtime/JSNumberCell.h>
#include <runtime/JSString.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSHTMLHeadingElement)

/* Hash table */

static const HashTableValue JSHTMLHeadingElementTableValues[3] =
{
    { "align", DontDelete, (intptr_t)jsHTMLHeadingElementAlign, (intptr_t)setJSHTMLHeadingElementAlign },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsHTMLHeadingElementConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLHeadingElementTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 7, JSHTMLHeadingElementTableValues, 0 };
#else
    { 5, 3, JSHTMLHeadingElementTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSHTMLHeadingElementConstructorTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLHeadingElementConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSHTMLHeadingElementConstructorTableValues, 0 };
#else
    { 1, 0, JSHTMLHeadingElementConstructorTableValues, 0 };
#endif

class JSHTMLHeadingElementConstructor : public DOMObject {
public:
    JSHTMLHeadingElementConstructor(ExecState* exec)
        : DOMObject(JSHTMLHeadingElementConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSHTMLHeadingElementPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSHTMLHeadingElementConstructor::s_info = { "HTMLHeadingElementConstructor", 0, &JSHTMLHeadingElementConstructorTable, 0 };

bool JSHTMLHeadingElementConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSHTMLHeadingElementConstructor, DOMObject>(exec, &JSHTMLHeadingElementConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSHTMLHeadingElementPrototypeTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLHeadingElementPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSHTMLHeadingElementPrototypeTableValues, 0 };
#else
    { 1, 0, JSHTMLHeadingElementPrototypeTableValues, 0 };
#endif

const ClassInfo JSHTMLHeadingElementPrototype::s_info = { "HTMLHeadingElementPrototype", 0, &JSHTMLHeadingElementPrototypeTable, 0 };

JSObject* JSHTMLHeadingElementPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSHTMLHeadingElement>(exec);
}

const ClassInfo JSHTMLHeadingElement::s_info = { "HTMLHeadingElement", &JSHTMLElement::s_info, &JSHTMLHeadingElementTable, 0 };

JSHTMLHeadingElement::JSHTMLHeadingElement(PassRefPtr<Structure> structure, PassRefPtr<HTMLHeadingElement> impl)
    : JSHTMLElement(structure, impl)
{
}

JSObject* JSHTMLHeadingElement::createPrototype(ExecState* exec)
{
    return new (exec) JSHTMLHeadingElementPrototype(JSHTMLHeadingElementPrototype::createStructure(JSHTMLElementPrototype::self(exec)));
}

bool JSHTMLHeadingElement::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSHTMLHeadingElement, Base>(exec, &JSHTMLHeadingElementTable, this, propertyName, slot);
}

JSValuePtr jsHTMLHeadingElementAlign(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLHeadingElement* imp = static_cast<HTMLHeadingElement*>(static_cast<JSHTMLHeadingElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->align());
}

JSValuePtr jsHTMLHeadingElementConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSHTMLHeadingElement*>(asObject(slot.slotBase()))->getConstructor(exec);
}
void JSHTMLHeadingElement::put(ExecState* exec, const Identifier& propertyName, JSValuePtr value, PutPropertySlot& slot)
{
    lookupPut<JSHTMLHeadingElement, Base>(exec, propertyName, value, &JSHTMLHeadingElementTable, this, slot);
}

void setJSHTMLHeadingElementAlign(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLHeadingElement* imp = static_cast<HTMLHeadingElement*>(static_cast<JSHTMLHeadingElement*>(thisObject)->impl());
    imp->setAlign(valueToStringWithNullCheck(exec, value));
}

JSValuePtr JSHTMLHeadingElement::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSHTMLHeadingElementConstructor>(exec);
}


}
