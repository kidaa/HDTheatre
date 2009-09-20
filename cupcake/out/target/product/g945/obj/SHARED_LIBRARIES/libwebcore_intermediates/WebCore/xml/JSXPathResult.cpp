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


#if ENABLE(XPATH)

#include "JSXPathResult.h"

#include <wtf/GetPtr.h>

#include "JSNode.h"
#include "KURL.h"
#include "Node.h"
#include "XPathResult.h"

#include <runtime/Error.h>
#include <runtime/JSNumberCell.h>
#include <runtime/JSString.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSXPathResult)

/* Hash table */

static const HashTableValue JSXPathResultTableValues[9] =
{
    { "resultType", DontDelete|ReadOnly, (intptr_t)jsXPathResultResultType, (intptr_t)0 },
    { "numberValue", DontDelete|ReadOnly, (intptr_t)jsXPathResultNumberValue, (intptr_t)0 },
    { "stringValue", DontDelete|ReadOnly, (intptr_t)jsXPathResultStringValue, (intptr_t)0 },
    { "booleanValue", DontDelete|ReadOnly, (intptr_t)jsXPathResultBooleanValue, (intptr_t)0 },
    { "singleNodeValue", DontDelete|ReadOnly, (intptr_t)jsXPathResultSingleNodeValue, (intptr_t)0 },
    { "invalidIteratorState", DontDelete|ReadOnly, (intptr_t)jsXPathResultInvalidIteratorState, (intptr_t)0 },
    { "snapshotLength", DontDelete|ReadOnly, (intptr_t)jsXPathResultSnapshotLength, (intptr_t)0 },
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsXPathResultConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSXPathResultTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 63, JSXPathResultTableValues, 0 };
#else
    { 18, 15, JSXPathResultTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSXPathResultConstructorTableValues[11] =
{
    { "ANY_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultANY_TYPE, (intptr_t)0 },
    { "NUMBER_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultNUMBER_TYPE, (intptr_t)0 },
    { "STRING_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultSTRING_TYPE, (intptr_t)0 },
    { "BOOLEAN_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultBOOLEAN_TYPE, (intptr_t)0 },
    { "UNORDERED_NODE_ITERATOR_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultUNORDERED_NODE_ITERATOR_TYPE, (intptr_t)0 },
    { "ORDERED_NODE_ITERATOR_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultORDERED_NODE_ITERATOR_TYPE, (intptr_t)0 },
    { "UNORDERED_NODE_SNAPSHOT_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultUNORDERED_NODE_SNAPSHOT_TYPE, (intptr_t)0 },
    { "ORDERED_NODE_SNAPSHOT_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultORDERED_NODE_SNAPSHOT_TYPE, (intptr_t)0 },
    { "ANY_UNORDERED_NODE_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultANY_UNORDERED_NODE_TYPE, (intptr_t)0 },
    { "FIRST_ORDERED_NODE_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultFIRST_ORDERED_NODE_TYPE, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSXPathResultConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 127, JSXPathResultConstructorTableValues, 0 };
#else
    { 33, 31, JSXPathResultConstructorTableValues, 0 };
#endif

class JSXPathResultConstructor : public DOMObject {
public:
    JSXPathResultConstructor(ExecState* exec)
        : DOMObject(JSXPathResultConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSXPathResultPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSXPathResultConstructor::s_info = { "XPathResultConstructor", 0, &JSXPathResultConstructorTable, 0 };

bool JSXPathResultConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSXPathResultConstructor, DOMObject>(exec, &JSXPathResultConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSXPathResultPrototypeTableValues[13] =
{
    { "ANY_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultANY_TYPE, (intptr_t)0 },
    { "NUMBER_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultNUMBER_TYPE, (intptr_t)0 },
    { "STRING_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultSTRING_TYPE, (intptr_t)0 },
    { "BOOLEAN_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultBOOLEAN_TYPE, (intptr_t)0 },
    { "UNORDERED_NODE_ITERATOR_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultUNORDERED_NODE_ITERATOR_TYPE, (intptr_t)0 },
    { "ORDERED_NODE_ITERATOR_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultORDERED_NODE_ITERATOR_TYPE, (intptr_t)0 },
    { "UNORDERED_NODE_SNAPSHOT_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultUNORDERED_NODE_SNAPSHOT_TYPE, (intptr_t)0 },
    { "ORDERED_NODE_SNAPSHOT_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultORDERED_NODE_SNAPSHOT_TYPE, (intptr_t)0 },
    { "ANY_UNORDERED_NODE_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultANY_UNORDERED_NODE_TYPE, (intptr_t)0 },
    { "FIRST_ORDERED_NODE_TYPE", DontDelete|ReadOnly, (intptr_t)jsXPathResultFIRST_ORDERED_NODE_TYPE, (intptr_t)0 },
    { "iterateNext", DontDelete|Function, (intptr_t)jsXPathResultPrototypeFunctionIterateNext, (intptr_t)0 },
    { "snapshotItem", DontDelete|Function, (intptr_t)jsXPathResultPrototypeFunctionSnapshotItem, (intptr_t)1 },
    { 0, 0, 0, 0 }
};

static const HashTable JSXPathResultPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 127, JSXPathResultPrototypeTableValues, 0 };
#else
    { 33, 31, JSXPathResultPrototypeTableValues, 0 };
#endif

const ClassInfo JSXPathResultPrototype::s_info = { "XPathResultPrototype", 0, &JSXPathResultPrototypeTable, 0 };

JSObject* JSXPathResultPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSXPathResult>(exec);
}

bool JSXPathResultPrototype::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticPropertySlot<JSXPathResultPrototype, JSObject>(exec, &JSXPathResultPrototypeTable, this, propertyName, slot);
}

const ClassInfo JSXPathResult::s_info = { "XPathResult", 0, &JSXPathResultTable, 0 };

JSXPathResult::JSXPathResult(PassRefPtr<Structure> structure, PassRefPtr<XPathResult> impl)
    : DOMObject(structure)
    , m_impl(impl)
{
}

JSXPathResult::~JSXPathResult()
{
    forgetDOMObject(*Heap::heap(this)->globalData(), m_impl.get());

}

JSObject* JSXPathResult::createPrototype(ExecState* exec)
{
    return new (exec) JSXPathResultPrototype(JSXPathResultPrototype::createStructure(exec->lexicalGlobalObject()->objectPrototype()));
}

bool JSXPathResult::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSXPathResult, Base>(exec, &JSXPathResultTable, this, propertyName, slot);
}

JSValuePtr jsXPathResultResultType(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    XPathResult* imp = static_cast<XPathResult*>(static_cast<JSXPathResult*>(asObject(slot.slotBase()))->impl());
    return jsNumber(exec, imp->resultType());
}

JSValuePtr jsXPathResultNumberValue(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    ExceptionCode ec = 0;
    XPathResult* imp = static_cast<XPathResult*>(static_cast<JSXPathResult*>(asObject(slot.slotBase()))->impl());
    JSC::JSValuePtr result = jsNumber(exec, imp->numberValue(ec));
    setDOMException(exec, ec);
    return result;
}

JSValuePtr jsXPathResultStringValue(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    ExceptionCode ec = 0;
    XPathResult* imp = static_cast<XPathResult*>(static_cast<JSXPathResult*>(asObject(slot.slotBase()))->impl());
    JSC::JSValuePtr result = jsString(exec, imp->stringValue(ec));
    setDOMException(exec, ec);
    return result;
}

JSValuePtr jsXPathResultBooleanValue(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    ExceptionCode ec = 0;
    XPathResult* imp = static_cast<XPathResult*>(static_cast<JSXPathResult*>(asObject(slot.slotBase()))->impl());
    JSC::JSValuePtr result = jsBoolean(imp->booleanValue(ec));
    setDOMException(exec, ec);
    return result;
}

JSValuePtr jsXPathResultSingleNodeValue(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    ExceptionCode ec = 0;
    XPathResult* imp = static_cast<XPathResult*>(static_cast<JSXPathResult*>(asObject(slot.slotBase()))->impl());
    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->singleNodeValue(ec)));
    setDOMException(exec, ec);
    return result;
}

JSValuePtr jsXPathResultInvalidIteratorState(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    UNUSED_PARAM(exec);
    XPathResult* imp = static_cast<XPathResult*>(static_cast<JSXPathResult*>(asObject(slot.slotBase()))->impl());
    return jsBoolean(imp->invalidIteratorState());
}

JSValuePtr jsXPathResultSnapshotLength(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    ExceptionCode ec = 0;
    XPathResult* imp = static_cast<XPathResult*>(static_cast<JSXPathResult*>(asObject(slot.slotBase()))->impl());
    JSC::JSValuePtr result = jsNumber(exec, imp->snapshotLength(ec));
    setDOMException(exec, ec);
    return result;
}

JSValuePtr jsXPathResultConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSXPathResult*>(asObject(slot.slotBase()))->getConstructor(exec);
}
JSValuePtr JSXPathResult::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSXPathResultConstructor>(exec);
}

JSValuePtr jsXPathResultPrototypeFunctionIterateNext(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSXPathResult::s_info))
        return throwError(exec, TypeError);
    JSXPathResult* castedThisObj = static_cast<JSXPathResult*>(asObject(thisValue));
    XPathResult* imp = static_cast<XPathResult*>(castedThisObj->impl());
    ExceptionCode ec = 0;


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->iterateNext(ec)));
    setDOMException(exec, ec);
    return result;
}

JSValuePtr jsXPathResultPrototypeFunctionSnapshotItem(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSXPathResult::s_info))
        return throwError(exec, TypeError);
    JSXPathResult* castedThisObj = static_cast<JSXPathResult*>(asObject(thisValue));
    XPathResult* imp = static_cast<XPathResult*>(castedThisObj->impl());
    ExceptionCode ec = 0;
    unsigned index = args.at(exec, 0).toInt32(exec);


    JSC::JSValuePtr result = toJS(exec, WTF::getPtr(imp->snapshotItem(index, ec)));
    setDOMException(exec, ec);
    return result;
}

// Constant getters

JSValuePtr jsXPathResultANY_TYPE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0));
}

JSValuePtr jsXPathResultNUMBER_TYPE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(1));
}

JSValuePtr jsXPathResultSTRING_TYPE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(2));
}

JSValuePtr jsXPathResultBOOLEAN_TYPE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(3));
}

JSValuePtr jsXPathResultUNORDERED_NODE_ITERATOR_TYPE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(4));
}

JSValuePtr jsXPathResultORDERED_NODE_ITERATOR_TYPE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(5));
}

JSValuePtr jsXPathResultUNORDERED_NODE_SNAPSHOT_TYPE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(6));
}

JSValuePtr jsXPathResultORDERED_NODE_SNAPSHOT_TYPE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(7));
}

JSValuePtr jsXPathResultANY_UNORDERED_NODE_TYPE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(8));
}

JSValuePtr jsXPathResultFIRST_ORDERED_NODE_TYPE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(9));
}

JSC::JSValuePtr toJS(JSC::ExecState* exec, XPathResult* object)
{
    return getDOMObjectWrapper<JSXPathResult>(exec, object);
}
XPathResult* toXPathResult(JSC::JSValuePtr value)
{
    return value.isObject(&JSXPathResult::s_info) ? static_cast<JSXPathResult*>(asObject(value))->impl() : 0;
}

}

#endif // ENABLE(XPATH)
