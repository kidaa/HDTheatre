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

#include "JSHTMLBodyElement.h"

#include <wtf/GetPtr.h>

#include "HTMLBodyElement.h"
#include "KURL.h"

#include <runtime/JSNumberCell.h>
#include <runtime/JSString.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSHTMLBodyElement)

/* Hash table */

static const HashTableValue JSHTMLBodyElementTableValues[12] =
{
    { "aLink", DontDelete, (intptr_t)jsHTMLBodyElementALink, (intptr_t)setJSHTMLBodyElementALink },
    { "background", DontDelete, (intptr_t)jsHTMLBodyElementBackground, (intptr_t)setJSHTMLBodyElementBackground },
    { "bgColor", DontDelete, (intptr_t)jsHTMLBodyElementBgColor, (intptr_t)setJSHTMLBodyElementBgColor },
    { "link", DontDelete, (intptr_t)jsHTMLBodyElementLink, (intptr_t)setJSHTMLBodyElementLink },
    { "text", DontDelete, (intptr_t)jsHTMLBodyElementText, (intptr_t)setJSHTMLBodyElementText },
    { "vLink", DontDelete, (intptr_t)jsHTMLBodyElementVLink, (intptr_t)setJSHTMLBodyElementVLink },
    { "scrollLeft", DontDelete, (intptr_t)jsHTMLBodyElementScrollLeft, (intptr_t)setJSHTMLBodyElementScrollLeft },
    { "scrollTop", DontDelete, (intptr_t)jsHTMLBodyElementScrollTop, (intptr_t)setJSHTMLBodyElementScrollTop },
    { "scrollWidth", DontDelete|ReadOnly, (intptr_t)jsHTMLBodyElementScrollWidth, (intptr_t)0 },
    { "scrollHeight", DontDelete|ReadOnly, (intptr_t)jsHTMLBodyElementScrollHeight, (intptr_t)0 },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsHTMLBodyElementConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLBodyElementTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 63, JSHTMLBodyElementTableValues, 0 };
#else
    { 33, 31, JSHTMLBodyElementTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSHTMLBodyElementConstructorTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLBodyElementConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSHTMLBodyElementConstructorTableValues, 0 };
#else
    { 1, 0, JSHTMLBodyElementConstructorTableValues, 0 };
#endif

class JSHTMLBodyElementConstructor : public DOMObject {
public:
    JSHTMLBodyElementConstructor(ExecState* exec)
        : DOMObject(JSHTMLBodyElementConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSHTMLBodyElementPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSHTMLBodyElementConstructor::s_info = { "HTMLBodyElementConstructor", 0, &JSHTMLBodyElementConstructorTable, 0 };

bool JSHTMLBodyElementConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSHTMLBodyElementConstructor, DOMObject>(exec, &JSHTMLBodyElementConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSHTMLBodyElementPrototypeTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSHTMLBodyElementPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSHTMLBodyElementPrototypeTableValues, 0 };
#else
    { 1, 0, JSHTMLBodyElementPrototypeTableValues, 0 };
#endif

const ClassInfo JSHTMLBodyElementPrototype::s_info = { "HTMLBodyElementPrototype", 0, &JSHTMLBodyElementPrototypeTable, 0 };

JSObject* JSHTMLBodyElementPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSHTMLBodyElement>(exec);
}

const ClassInfo JSHTMLBodyElement::s_info = { "HTMLBodyElement", &JSHTMLElement::s_info, &JSHTMLBodyElementTable, 0 };

JSHTMLBodyElement::JSHTMLBodyElement(PassRefPtr<Structure> structure, PassRefPtr<HTMLBodyElement> impl)
    : JSHTMLElement(structure, impl)
{
}

JSObject* JSHTMLBodyElement::createPrototype(ExecState* exec)
{
    return new (exec) JSHTMLBodyElementPrototype(JSHTMLBodyElementPrototype::createStructure(JSHTMLElementPrototype::self(exec)));
}

bool JSHTMLBodyElement::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSHTMLBodyElement, Base>(exec, &JSHTMLBodyElementTable, this, propertyName, slot);
}

JSValuePtr jsHTMLBodyElementALink(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->aLink());
}

JSValuePtr jsHTMLBodyElementBackground(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->background());
}

JSValuePtr jsHTMLBodyElementBgColor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->bgColor());
}

JSValuePtr jsHTMLBodyElementLink(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->link());
}

JSValuePtr jsHTMLBodyElementText(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->text());
}

JSValuePtr jsHTMLBodyElementVLink(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(asObject(slot.slotBase()))->impl());
    return jsString(exec, imp->vLink());
}

JSValuePtr jsHTMLBodyElementScrollLeft(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->scrollLeft());
}

JSValuePtr jsHTMLBodyElementScrollTop(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->scrollTop());
}

JSValuePtr jsHTMLBodyElementScrollWidth(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->scrollWidth());
}

JSValuePtr jsHTMLBodyElementScrollHeight(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->scrollHeight());
}

JSValuePtr jsHTMLBodyElementConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSHTMLBodyElement*>(asObject(slot.slotBase()))->getConstructor(exec);
}
void JSHTMLBodyElement::put(ExecState* exec, const Identifier& propertyName, JSValuePtr value, PutPropertySlot& slot)
{
    lookupPut<JSHTMLBodyElement, Base>(exec, propertyName, value, &JSHTMLBodyElementTable, this, slot);
}

void setJSHTMLBodyElementALink(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(thisObject)->impl());
    imp->setALink(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLBodyElementBackground(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(thisObject)->impl());
    imp->setBackground(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLBodyElementBgColor(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(thisObject)->impl());
    imp->setBgColor(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLBodyElementLink(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(thisObject)->impl());
    imp->setLink(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLBodyElementText(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(thisObject)->impl());
    imp->setText(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLBodyElementVLink(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(thisObject)->impl());
    imp->setVLink(valueToStringWithNullCheck(exec, value));
}

void setJSHTMLBodyElementScrollLeft(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(thisObject)->impl());
    imp->setScrollLeft(value.toInt32(exec));
}

void setJSHTMLBodyElementScrollTop(ExecState* exec, JSObject* thisObject, JSValuePtr value)
{
    HTMLBodyElement* imp = static_cast<HTMLBodyElement*>(static_cast<JSHTMLBodyElement*>(thisObject)->impl());
    imp->setScrollTop(value.toInt32(exec));
}

JSValuePtr JSHTMLBodyElement::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSHTMLBodyElementConstructor>(exec);
}


}
