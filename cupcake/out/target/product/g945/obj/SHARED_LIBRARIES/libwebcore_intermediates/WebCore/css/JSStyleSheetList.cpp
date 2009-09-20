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

#include "JSStyleSheetList.h"

#include <wtf/GetPtr.h>

#include <runtime/PropertyNameArray.h>
#include "AtomicString.h"
#include "JSStyleSheet.h"
#include "StyleSheet.h"
#include "StyleSheetList.h"

#include <runtime/Error.h>
#include <runtime/JSNumberCell.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSStyleSheetList)

/* Hash table */

static const HashTableValue JSStyleSheetListTableValues[3] =
{
    { "length", DontDelete|ReadOnly, (intptr_t)jsStyleSheetListLength, (intptr_t)0 },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsStyleSheetListConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSStyleSheetListTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 15, JSStyleSheetListTableValues, 0 };
#else
    { 5, 3, JSStyleSheetListTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSStyleSheetListConstructorTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSStyleSheetListConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSStyleSheetListConstructorTableValues, 0 };
#else
    { 1, 0, JSStyleSheetListConstructorTableValues, 0 };
#endif

class JSStyleSheetListConstructor : public DOMObject {
public:
    JSStyleSheetListConstructor(ExecState* exec)
        : DOMObject(JSStyleSheetListConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSStyleSheetListPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSStyleSheetListConstructor::s_info = { "StyleSheetListConstructor", 0, &JSStyleSheetListConstructorTable, 0 };

bool JSStyleSheetListConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSStyleSheetListConstructor, DOMObject>(exec, &JSStyleSheetListConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSStyleSheetListPrototypeTableValues[2] =
{
    { "item", DontDelete|Function, (intptr_t)jsStyleSheetListPrototypeFunctionItem, (intptr_t)1 },
    { 0, 0, 0, 0 }
};

static const HashTable JSStyleSheetListPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSStyleSheetListPrototypeTableValues, 0 };
#else
    { 2, 1, JSStyleSheetListPrototypeTableValues, 0 };
#endif

const ClassInfo JSStyleSheetListPrototype::s_info = { "StyleSheetListPrototype", 0, &JSStyleSheetListPrototypeTable, 0 };

JSObject* JSStyleSheetListPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSStyleSheetList>(exec);
}

bool JSStyleSheetListPrototype::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticFunctionSlot<JSObject>(exec, &JSStyleSheetListPrototypeTable, this, propertyName, slot);
}

const ClassInfo JSStyleSheetList::s_info = { "StyleSheetList", 0, &JSStyleSheetListTable, 0 };

JSStyleSheetList::JSStyleSheetList(PassRefPtr<Structure> structure, PassRefPtr<StyleSheetList> impl)
    : DOMObject(structure)
    , m_impl(impl)
{
}

JSStyleSheetList::~JSStyleSheetList()
{
    forgetDOMObject(*Heap::heap(this)->globalData(), m_impl.get());

}

JSObject* JSStyleSheetList::createPrototype(ExecState* exec)
{
    return new (exec) JSStyleSheetListPrototype(JSStyleSheetListPrototype::createStructure(exec->lexicalGlobalObject()->objectPrototype()));
}

bool JSStyleSheetList::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    const HashEntry* entry = JSStyleSheetListTable.entry(exec, propertyName);
    if (entry) {
        slot.setCustom(this, entry->propertyGetter());
        return true;
    }
    bool ok;
    unsigned index = propertyName.toUInt32(&ok, false);
    if (ok && index < static_cast<StyleSheetList*>(impl())->length()) {
        slot.setCustomIndex(this, index, indexGetter);
        return true;
    }
    if (canGetItemsForName(exec, static_cast<StyleSheetList*>(impl()), propertyName)) {
        slot.setCustom(this, nameGetter);
        return true;
    }
    return getStaticValueSlot<JSStyleSheetList, Base>(exec, &JSStyleSheetListTable, this, propertyName, slot);
}

bool JSStyleSheetList::getOwnPropertySlot(ExecState* exec, unsigned propertyName, PropertySlot& slot)
{
    if (propertyName < static_cast<StyleSheetList*>(impl())->length()) {
        slot.setCustomIndex(this, propertyName, indexGetter);
        return true;
    }
    return getOwnPropertySlot(exec, Identifier::from(exec, propertyName), slot);
}

JSValuePtr jsStyleSheetListLength(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    StyleSheetList* imp = static_cast<StyleSheetList*>(static_cast<JSStyleSheetList*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->length());
}

JSValuePtr jsStyleSheetListConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSStyleSheetList*>(asObject(slot.slotBase()))->getConstructor(exec);
}
void JSStyleSheetList::getPropertyNames(ExecState* exec, PropertyNameArray& propertyNames)
{
    for (unsigned i = 0; i < static_cast<StyleSheetList*>(impl())->length(); ++i)
        propertyNames.add(Identifier::from(exec, i));
     Base::getPropertyNames(exec, propertyNames);
}

JSValuePtr JSStyleSheetList::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSStyleSheetListConstructor>(exec);
}

JSValuePtr jsStyleSheetListPrototypeFunctionItem(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSStyleSheetList::s_info))
        return throwError(exec, TypeError);
    JSStyleSheetList* castedThisObj = static_cast<JSStyleSheetList*>(asObject(thisValue));
    StyleSheetList* imp = static_cast<StyleSheetList*>(castedThisObj->impl());
    unsigned index = args.at(exec, 0).toInt32(exec);


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->item(index)));
    return result;
}


JSValuePtr JSStyleSheetList::indexGetter(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    JSStyleSheetList* thisObj = static_cast<JSStyleSheetList*>(asObject(slot.slotBase()));
    return toJS(exec, static_cast<StyleSheetList*>(thisObj->impl())->item(slot.index()));
}
JSC::JSValuePtr toJS(JSC::ExecState* exec, StyleSheetList* object)
{
    return getDOMObjectWrapper<JSStyleSheetList>(exec, object);
}
StyleSheetList* toStyleSheetList(JSC::JSValuePtr value)
{
    return value.isObject(&JSStyleSheetList::s_info) ? static_cast<JSStyleSheetList*>(asObject(value))->impl() : 0;
}

}
