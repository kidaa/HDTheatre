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

#include "JSHTMLTableCaptionElement.h"

#include <wtf/GetPtr.h>

#include "HTMLTableCaptionElement.h"
#include "KURL.h"

#include <runtime/JSNumberCell.h>
#include <runtime/JSString.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSHTMLTableCaptionElement)

/* Hash table */

static const HashTableValue JSHTMLTableCaptionElementTableValues[3] =
{
    { "align", DontDelete, (intptr_t)jsHTMLTableCaptionElementAlign, (intptr_t)setJSHTMLTableCaptionElementAlign },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsHTMLTableCaptionElementConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLTableCaptionElementTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 7, JSHTMLTableCaptionElementTableValues, 0 };
#else
    { 5, 3, JSHTMLTableCaptionElementTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSHTMLTableCaptionElementConstructorTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLTableCaptionElementConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSHTMLTableCaptionElementConstructorTableValues, 0 };
#else
    { 1, 0, JSHTMLTableCaptionElementConstructorTableValues, 0 };
#endif

class JSHTMLTableCaptionElementConstructor : public DOMObject {
public:
    JSHTMLTableCaptionElementConstructor(ExecState* exec)
        : DOMObject(JSHTMLTableCaptionElementConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSHTMLTableCaptionElementPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSHTMLTableCaptionElementConstructor::s_info = { "HTMLTableCaptionElementConstructor", 0, &JSHTMLTableCaptionElementConstructorTable, 0 };

bool JSHTMLTableCaptionElementConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSHTMLTableCaptionElementConstructor, DOMObject>(exec, &JSHTMLTableCaptionElementConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSHTMLTableCaptionElementPrototypeTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLTableCaptionElementPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSHTMLTableCaptionElementPrototypeTableValues, 0 };
#else
    { 1, 0, JSHTMLTableCaptionElementPrototypeTableValues, 0 };
#endif

const ClassInfo JSHTMLTableCaptionElementPrototype::s_info = { "HTMLTableCaptionElementPrototype", 0, &JSHTMLTableCaptionElementPrototypeTable, 0 };

JSObject* JSHTMLTableCaptionElementPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSHTMLTableCaptionElement>(exec);
}

const ClassInfo JSHTMLTableCaptionElement::s_info = { "HTMLTableCaptionElement", &JSHTMLElement::s_info, &JSHTMLTableCaptionElementTable, 0 };

JSHTMLTableCaptionElement::JSHTMLTableCaptionElement(PassRefPtr<Structure> structure, PassRefPtr<HTMLTableCaptionElement> impl)
    : JSHTMLElement(structure, impl)
{
}

JSObject* JSHTMLTableCaptionElement::createPrototype(ExecState* exec)
{
    return new (exec) JSHTMLTableCaptionElementPrototype(JSHTMLTableCaptionElementPrototype::createStructure(JSHTMLElementPrototype::self(exec)));
}

bool JSHTMLTableCaptionElement::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSHTMLTableCaptionElement, Base>(exec, &JSHTMLTableCaptionElementTable, this, propertyName, slot);
}

JSValuePtr jsHTMLTableCaptionElementAlign(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLTableCaptionElement* imp = static_cast<HTMLTableCaptionElement*>(static_cast<JSHTMLTableCaptionElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->align());
}

JSValuePtr jsHTMLTableCaptionElementConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSHTMLTableCaptionElement*>(asObject(slot.slotBase()))->getConstructor(exec);
}
void JSHTMLTableCaptionElement::put(ExecState* exec, const Identifier& propertyName, JSValuePtr value, PutPropertySlot& slot)
{
    lookupPut<JSHTMLTableCaptionElement, Base>(exec, propertyName, value, &JSHTMLTableCaptionElementTable, this, slot);
}

void setJSHTMLTableCaptionElementAlign(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLTableCaptionElement* imp = static_cast<HTMLTableCaptionElement*>(static_cast<JSHTMLTableCaptionElement*>(thisObject)->impl());
    imp->setAlign(valueToStringWithNullCheck(exec, value));
}

JSValuePtr JSHTMLTableCaptionElement::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSHTMLTableCaptionElementConstructor>(exec);
}

HTMLTableCaptionElement* toHTMLTableCaptionElement(JSC::JSValuePtr value)
{
    return value.isObject(&JSHTMLTableCaptionElement::s_info) ? static_cast<JSHTMLTableCaptionElement*>(asObject(value))->impl() : 0;
}

}
