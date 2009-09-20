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

#include "JSNodeFilter.h"

#include <wtf/GetPtr.h>

#include "NodeFilter.h"

#include <runtime/Error.h>
#include <runtime/JSNumberCell.h>

using namespace JSC;

namespace WebCore {

ASSERT_CLASS_FITS_IN_CELL(JSNodeFilter)

/* Hash table */

static const HashTableValue JSNodeFilterTableValues[2] =
{
    { "constructor", DontEnum|ReadOnly, (intptr_t)jsNodeFilterConstructor, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSNodeFilterTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 0, JSNodeFilterTableValues, 0 };
#else
    { 2, 1, JSNodeFilterTableValues, 0 };
#endif

/* Hash table for constructor */

static const HashTableValue JSNodeFilterConstructorTableValues[17] =
{
    { "FILTER_ACCEPT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterFILTER_ACCEPT, (intptr_t)0 },
    { "FILTER_REJECT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterFILTER_REJECT, (intptr_t)0 },
    { "FILTER_SKIP", DontDelete|ReadOnly, (intptr_t)jsNodeFilterFILTER_SKIP, (intptr_t)0 },
    { "SHOW_ALL", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_ALL, (intptr_t)0 },
    { "SHOW_ELEMENT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_ELEMENT, (intptr_t)0 },
    { "SHOW_ATTRIBUTE", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_ATTRIBUTE, (intptr_t)0 },
    { "SHOW_TEXT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_TEXT, (intptr_t)0 },
    { "SHOW_CDATA_SECTION", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_CDATA_SECTION, (intptr_t)0 },
    { "SHOW_ENTITY_REFERENCE", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_ENTITY_REFERENCE, (intptr_t)0 },
    { "SHOW_ENTITY", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_ENTITY, (intptr_t)0 },
    { "SHOW_PROCESSING_INSTRUCTION", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_PROCESSING_INSTRUCTION, (intptr_t)0 },
    { "SHOW_COMMENT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_COMMENT, (intptr_t)0 },
    { "SHOW_DOCUMENT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_DOCUMENT, (intptr_t)0 },
    { "SHOW_DOCUMENT_TYPE", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_DOCUMENT_TYPE, (intptr_t)0 },
    { "SHOW_DOCUMENT_FRAGMENT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_DOCUMENT_FRAGMENT, (intptr_t)0 },
    { "SHOW_NOTATION", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_NOTATION, (intptr_t)0 },
    { 0, 0, 0, 0 }
};

static const HashTable JSNodeFilterConstructorTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 127, JSNodeFilterConstructorTableValues, 0 };
#else
    { 34, 31, JSNodeFilterConstructorTableValues, 0 };
#endif

class JSNodeFilterConstructor : public DOMObject {
public:
    JSNodeFilterConstructor(ExecState* exec)
        : DOMObject(JSNodeFilterConstructor::createStructure(exec->lexicalGlobalObject()->objectPrototype()))
    {
        putDirect(exec->propertyNames().prototype, JSNodeFilterPrototype::self(exec), None);
    }
    virtual bool getOwnPropertySlot(ExecState*, const Identifier&, PropertySlot&);
    virtual const ClassInfo* classInfo() const { return &s_info; }
    static const ClassInfo s_info;

    static PassRefPtr<Structure> createStructure(JSValuePtr proto) 
    { 
        return Structure::create(proto, TypeInfo(ObjectType, ImplementsHasInstance)); 
    }
};

const ClassInfo JSNodeFilterConstructor::s_info = { "NodeFilterConstructor", 0, &JSNodeFilterConstructorTable, 0 };

bool JSNodeFilterConstructor::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSNodeFilterConstructor, DOMObject>(exec, &JSNodeFilterConstructorTable, this, propertyName, slot);
}

/* Hash table for prototype */

static const HashTableValue JSNodeFilterPrototypeTableValues[18] =
{
    { "FILTER_ACCEPT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterFILTER_ACCEPT, (intptr_t)0 },
    { "FILTER_REJECT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterFILTER_REJECT, (intptr_t)0 },
    { "FILTER_SKIP", DontDelete|ReadOnly, (intptr_t)jsNodeFilterFILTER_SKIP, (intptr_t)0 },
    { "SHOW_ALL", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_ALL, (intptr_t)0 },
    { "SHOW_ELEMENT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_ELEMENT, (intptr_t)0 },
    { "SHOW_ATTRIBUTE", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_ATTRIBUTE, (intptr_t)0 },
    { "SHOW_TEXT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_TEXT, (intptr_t)0 },
    { "SHOW_CDATA_SECTION", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_CDATA_SECTION, (intptr_t)0 },
    { "SHOW_ENTITY_REFERENCE", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_ENTITY_REFERENCE, (intptr_t)0 },
    { "SHOW_ENTITY", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_ENTITY, (intptr_t)0 },
    { "SHOW_PROCESSING_INSTRUCTION", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_PROCESSING_INSTRUCTION, (intptr_t)0 },
    { "SHOW_COMMENT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_COMMENT, (intptr_t)0 },
    { "SHOW_DOCUMENT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_DOCUMENT, (intptr_t)0 },
    { "SHOW_DOCUMENT_TYPE", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_DOCUMENT_TYPE, (intptr_t)0 },
    { "SHOW_DOCUMENT_FRAGMENT", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_DOCUMENT_FRAGMENT, (intptr_t)0 },
    { "SHOW_NOTATION", DontDelete|ReadOnly, (intptr_t)jsNodeFilterSHOW_NOTATION, (intptr_t)0 },
    { "acceptNode", DontDelete|Function, (intptr_t)jsNodeFilterPrototypeFunctionAcceptNode, (intptr_t)1 },
    { 0, 0, 0, 0 }
};

static const HashTable JSNodeFilterPrototypeTable =
#if ENABLE(PERFECT_HASH_SIZE)
    { 255, JSNodeFilterPrototypeTableValues, 0 };
#else
    { 66, 63, JSNodeFilterPrototypeTableValues, 0 };
#endif

const ClassInfo JSNodeFilterPrototype::s_info = { "NodeFilterPrototype", 0, &JSNodeFilterPrototypeTable, 0 };

JSObject* JSNodeFilterPrototype::self(ExecState* exec)
{
    return getDOMPrototype<JSNodeFilter>(exec);
}

bool JSNodeFilterPrototype::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticPropertySlot<JSNodeFilterPrototype, JSObject>(exec, &JSNodeFilterPrototypeTable, this, propertyName, slot);
}

const ClassInfo JSNodeFilter::s_info = { "NodeFilter", 0, &JSNodeFilterTable, 0 };

JSNodeFilter::JSNodeFilter(PassRefPtr<Structure> structure, PassRefPtr<NodeFilter> impl)
    : DOMObject(structure)
    , m_impl(impl)
{
}

JSNodeFilter::~JSNodeFilter()
{
    forgetDOMObject(*Heap::heap(this)->globalData(), m_impl.get());

}

JSObject* JSNodeFilter::createPrototype(ExecState* exec)
{
    return new (exec) JSNodeFilterPrototype(JSNodeFilterPrototype::createStructure(exec->lexicalGlobalObject()->objectPrototype()));
}

bool JSNodeFilter::getOwnPropertySlot(ExecState* exec, const Identifier& propertyName, PropertySlot& slot)
{
    return getStaticValueSlot<JSNodeFilter, Base>(exec, &JSNodeFilterTable, this, propertyName, slot);
}

JSValuePtr jsNodeFilterConstructor(ExecState* exec, const Identifier&, const PropertySlot& slot)
{
    return static_cast<JSNodeFilter*>(asObject(slot.slotBase()))->getConstructor(exec);
}
JSValuePtr JSNodeFilter::getConstructor(ExecState* exec)
{
    return getDOMConstructor<JSNodeFilterConstructor>(exec);
}

JSValuePtr jsNodeFilterPrototypeFunctionAcceptNode(ExecState* exec, JSObject*, JSValuePtr thisValue, const ArgList& args)
{
    UNUSED_PARAM(args);
    if (!thisValue.isObject(&JSNodeFilter::s_info))
        return throwError(exec, TypeError);
    JSNodeFilter* castedThisObj = static_cast<JSNodeFilter*>(asObject(thisValue));
    return castedThisObj->acceptNode(exec, args);
}

// Constant getters

JSValuePtr jsNodeFilterFILTER_ACCEPT(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(1));
}

JSValuePtr jsNodeFilterFILTER_REJECT(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(2));
}

JSValuePtr jsNodeFilterFILTER_SKIP(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(3));
}

JSValuePtr jsNodeFilterSHOW_ALL(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0xFFFFFFFF));
}

JSValuePtr jsNodeFilterSHOW_ELEMENT(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000001));
}

JSValuePtr jsNodeFilterSHOW_ATTRIBUTE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000002));
}

JSValuePtr jsNodeFilterSHOW_TEXT(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000004));
}

JSValuePtr jsNodeFilterSHOW_CDATA_SECTION(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000008));
}

JSValuePtr jsNodeFilterSHOW_ENTITY_REFERENCE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000010));
}

JSValuePtr jsNodeFilterSHOW_ENTITY(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000020));
}

JSValuePtr jsNodeFilterSHOW_PROCESSING_INSTRUCTION(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000040));
}

JSValuePtr jsNodeFilterSHOW_COMMENT(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000080));
}

JSValuePtr jsNodeFilterSHOW_DOCUMENT(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000100));
}

JSValuePtr jsNodeFilterSHOW_DOCUMENT_TYPE(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000200));
}

JSValuePtr jsNodeFilterSHOW_DOCUMENT_FRAGMENT(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000400));
}

JSValuePtr jsNodeFilterSHOW_NOTATION(ExecState* exec, const Identifier&, const PropertySlot&)
{
    return jsNumber(exec, static_cast<int>(0x00000800));
}

JSC::JSValuePtr toJS(JSC::ExecState* exec, NodeFilter* object)
{
    return getDOMObjectWrapper<JSNodeFilter>(exec, object);
}

}
