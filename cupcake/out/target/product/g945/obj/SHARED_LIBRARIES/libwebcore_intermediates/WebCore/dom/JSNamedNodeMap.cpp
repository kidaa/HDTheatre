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

#include "JSNamedNodeMap.h"

#include <wtf/GetPtr.h>

#include <runtime/PropertyNameArray.h>
#include "AtomicString.h"
#include "JSNode.h"
#include "NamedNodeMap.h"
#include "Node.h"

#include <runtime/Error.h>
#include <runtime/JSNumberCell.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSNamedNodeMap)

/* Hash table */

static const HashTableValue JSNamedNodeMapTableValues[3] =
{
    { "length", DontDelete|ReadOnly, (intptr_t)jsNamedNodeMapLength, (intptr_t)0 },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsNamedNodeMapConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSNamedNodeMapTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 15, JSNamedNodeMapTableValues, 0 };
#else
    { 5, 3, JSNamedNodeMapTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSNamedNodeMapConstructorTableValues[1] =
{
    { 0, 0, 0, 0 }
};

static const HashTable JSNamedNodeMapConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSNamedNodeMapConstructorTableValues, 0 };
#else
    { 1, 0, JSNamedNodeMapConstructorTableValues, 0 };
#endif

class JSNamedNodeMapConstructor : public DOMObject {
public:
    JSNamedNodeMapConstructor(ExecState* exec)
        : DOMObject(JSNamedNodeMapConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSNamedNodeMapPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSNamedNodeMapConstructor::s_info = { "NamedNodeMapConstructor", 0, &JSNamedNodeMapConstructorTable, 0 };

bool JSNamedNodeMapConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSNamedNodeMapConstructor, DOMObject>(exec, &JSNamedNodeMapConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSNamedNodeMapPrototypeTableValues[8] =
{
    { "getNamedItem", DontDelete|Function, (intptr_t)jsNamedNodeMapPrototypeFunctionGetNamedItem, (intptr_t)1 },
    { "setNamedItem", DontDelete|Function, (intptr_t)jsNamedNodeMapPrototypeFunctionSetNamedItem, (intptr_t)1 },
    { "removeNamedItem", DontDelete|Function, (intptr_t)jsNamedNodeMapPrototypeFunctionRemoveNamedItem, (intptr_t)1 },
    { "item", DontDelete|Function, (intptr_t)jsNamedNodeMapPrototypeFunctionItem, (intptr_t)1 },
    { "getNamedItemNS", DontDelete|Function, (intptr_t)jsNamedNodeMapPrototypeFunctionGetNamedItemNS, (intptr_t)2 },
    { "setNamedItemNS", DontDelete|Function, (intptr_t)jsNamedNodeMapPrototypeFunctionSetNamedItemNS, (intptr_t)1 },
    { "removeNamedItemNS", DontDelete|Function, (intptr_t)jsNamedNodeMapPrototypeFunctionRemoveNamedItemNS, (intptr_t)2 },
    { 0, 0, 0, 0 }
};

static const HashTable JSNamedNodeMapPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 15, JSNamedNodeMapPrototypeTableValues, 0 };
#else
    { 16, 15, JSNamedNodeMapPrototypeTableValues, 0 };
#endif

const ClassInfo JSNamedNodeMapPrototype::s_info = { "NamedNodeMapPrototype", 0, &JSNamedNodeMapPrototypeTable, 0 };

JSObject* JSNamedNodeMapPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSNamedNodeMap>(exec);
}

bool JSNamedNodeMapPrototype::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticFunctionSlot<JSObject>(exec, &JSNamedNodeMapPrototypeTable, this, propertyName, slot);
}

const ClassInfo JSNamedNodeMap::s_info = { "NamedNodeMap", 0, &JSNamedNodeMapTable, 0 };

JSNamedNodeMap::JSNamedNodeMap(PassRefPtr<Structure> structure, PassRefPtr<NamedNodeMap> impl)
    : DOMObject(structure)
    , m_impl(impl)
{
}

JSNamedNodeMap::~JSNamedNodeMap()
{
    forgetDOMObject(*Heap::heap(this)->globalData(), m_impl.get());

}

JSObject* JSNamedNodeMap::createPrototype(ExecState* exec)
{
    return new (exec) JSNamedNodeMapPrototype(JSNamedNodeMapPrototype::createStructure(exec->lexicalGlobalObject()->objectPrototype()));
}

bool JSNamedNodeMap::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    JSValuePtr proto = prototype();
    if (proto.isObject() && static_cast<JSObject*>(asObject(proto))->hasProperty(exec, propertyName))
        return false;

    const HashEntry* entry = JSNamedNodeMapTable.entry(exec, propertyName);
    if (entry) {
        slot.setCustom(this, entry->propertyGetter());
        return true;
    }
    bool ok;
    unsigned index = propertyName.toUInt32(&ok, false);
    if (ok && index < static_cast<NamedNodeMap*>(impl())->length()) {
        slot.setCustomIndex(this, index, indexGetter);
        return true;
    }
    if (canGetItemsForName(exec, static_cast<NamedNodeMap*>(impl()), propertyName)) {
        slot.setCustom(this, nameGetter);
        return true;
    }
    return getStaticValueSlot<JSNamedNodeMap, Base>(exec, &JSNamedNodeMapTable, this, propertyName, slot);
}

bool JSNamedNodeMap::getOwnPropertySlot(ExecState* exec, unsigned propertyName, PropertySlot& slot)
{
    if (propertyName < static_cast<NamedNodeMap*>(impl())->length()) {
        slot.setCustomIndex(this, propertyName, indexGetter);
        return true;
    }
    return getOwnPropertySlot(exec, Identifier::from(exec, propertyName), slot);
}

JSValuePtr jsNamedNodeMapLength(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    NamedNodeMap* imp = static_cast<NamedNodeMap*>(static_cast<JSNamedNodeMap*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->length());
}

JSValuePtr jsNamedNodeMapConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSNamedNodeMap*>(asObject(slot.slotBase()))->getConstructor(exec);
}
void JSNamedNodeMap::getPropertyNames(ExecState* exec, PropertyNameArray& propertyNames)
{
    for (unsigned i = 0; i < static_cast<NamedNodeMap*>(impl())->length(); ++i)
        propertyNames.add(Identifier::from(exec, i));
     Base::getPropertyNames(exec, propertyNames);
}

JSValuePtr JSNamedNodeMap::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSNamedNodeMapConstructor>(exec);
}

JSValuePtr jsNamedNodeMapPrototypeFunctionGetNamedItem(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSNamedNodeMap::s_info))
        return throwError(exec, TypeError);
    JSNamedNodeMap* castedThisObj = static_cast<JSNamedNodeMap*>(asObject(thisValue));
    NamedNodeMap* imp = static_cast<NamedNodeMap*>(castedThisObj->impl());
    const UString& name = args.at(exec, 0).toString(exec);


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->getNamedItem(name)));
    return result;
}

JSValuePtr jsNamedNodeMapPrototypeFunctionSetNamedItem(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSNamedNodeMap::s_info))
        return throwError(exec, TypeError);
    JSNamedNodeMap* castedThisObj = static_cast<JSNamedNodeMap*>(asObject(thisValue));
    NamedNodeMap* imp = static_cast<NamedNodeMap*>(castedThisObj->impl());
    ExceptionCode ec = 0;
    Node* node = toNode(args.at(exec, 0));


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->setNamedItem(node, ec)));
    setDOMException(exec, ec);
    return result;
}

JSValuePtr jsNamedNodeMapPrototypeFunctionRemoveNamedItem(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSNamedNodeMap::s_info))
        return throwError(exec, TypeError);
    JSNamedNodeMap* castedThisObj = static_cast<JSNamedNodeMap*>(asObject(thisValue));
    NamedNodeMap* imp = static_cast<NamedNodeMap*>(castedThisObj->impl());
    ExceptionCode ec = 0;
    const UString& name = args.at(exec, 0).toString(exec);


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->removeNamedItem(name, ec)));
    setDOMException(exec, ec);
    return result;
}

JSValuePtr jsNamedNodeMapPrototypeFunctionItem(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSNamedNodeMap::s_info))
        return throwError(exec, TypeError);
    JSNamedNodeMap* castedThisObj = static_cast<JSNamedNodeMap*>(asObject(thisValue));
    NamedNodeMap* imp = static_cast<NamedNodeMap*>(castedThisObj->impl());
    unsigned index = args.at(exec, 0).toInt32(exec);


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->item(index)));
    return result;
}

JSValuePtr jsNamedNodeMapPrototypeFunctionGetNamedItemNS(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSNamedNodeMap::s_info))
        return throwError(exec, TypeError);
    JSNamedNodeMap* castedThisObj = static_cast<JSNamedNodeMap*>(asObject(thisValue));
    NamedNodeMap* imp = static_cast<NamedNodeMap*>(castedThisObj->impl());
    const UString& namespaceURI = valueToStringWithNullCheck(exec, args.at(exec, 0));
    const UString& localName = args.at(exec, 1).toString(exec);


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->getNamedItemNS(namespaceURI, localName)));
    return result;
}

JSValuePtr jsNamedNodeMapPrototypeFunctionSetNamedItemNS(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSNamedNodeMap::s_info))
        return throwError(exec, TypeError);
    JSNamedNodeMap* castedThisObj = static_cast<JSNamedNodeMap*>(asObject(thisValue));
    NamedNodeMap* imp = static_cast<NamedNodeMap*>(castedThisObj->impl());
    ExceptionCode ec = 0;
    Node* node = toNode(args.at(exec, 0));


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->setNamedItemNS(node, ec)));
    setDOMException(exec, ec);
    return result;
}

JSValuePtr jsNamedNodeMapPrototypeFunctionRemoveNamedItemNS(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSNamedNodeMap::s_info))
        return throwError(exec, TypeError);
    JSNamedNodeMap* castedThisObj = static_cast<JSNamedNodeMap*>(asObject(thisValue));
    NamedNodeMap* imp = static_cast<NamedNodeMap*>(castedThisObj->impl());
    ExceptionCode ec = 0;
    const UString& namespaceURI = valueToStringWithNullCheck(exec, args.at(exec, 0));
    const UString& localName = args.at(exec, 1).toString(exec);


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->removeNamedItemNS(namespaceURI, localName, ec)));
    setDOMException(exec, ec);
    return result;
}


JSValuePtr JSNamedNodeMap::indexGetter(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    JSNamedNodeMap* thisObj = static_cast<JSNamedNodeMap*>(asObject(slot.slotBase()));
    return toJS(exec, static_cast<NamedNodeMap*>(thisObj->impl())->item(slot.index()));
}
JSC::JSValuePtr toJS(JSC::ExecState* exec, NamedNodeMap* object)
{
    return getDOMObjectWrapper<JSNamedNodeMap>(exec, object);
}
NamedNodeMap* toNamedNodeMap(JSC::JSValuePtr value)
{
    return value.isObject(&JSNamedNodeMap::s_info) ? static_cast<JSNamedNodeMap*>(asObject(value))->impl() : 0;
}

}
