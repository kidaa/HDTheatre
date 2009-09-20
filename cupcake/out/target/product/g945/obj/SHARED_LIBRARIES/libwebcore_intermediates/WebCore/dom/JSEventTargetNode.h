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

#ifndef JSEventTargetNode_h
#define JSEventTargetNode_h

#include "JSNode.h"
#include "EventTargetNode.h"
namespace WebCore {

class EventTargetNode;

class JSEventTargetNode : public JSNode {
    typedef JSNode Base;
public:
    JSEventTargetNode(PassRefPtr<JSC::Structure>, PassRefPtr<EventTargetNode>);
    static JSC::JSObject* createPrototype(JSC::ExecState*);
    virtual bool getOwnPropertySlot(JSC::ExecState*, const JSC::Identifier& propertyName, JSC::PropertySlot&);
    virtual void put(JSC::ExecState*, const JSC::Identifier& propertyName, JSC::JSValuePtr, JSC::PutPropertySlot&);
    virtual const JSC::ClassInfo* classInfo() const { return &s_info; }
    static const JSC::ClassInfo s_info;

    static PassRefPtr<JSC::Structure> createStructure(JSC::JSValuePtr prototype)
    {
        return JSC::Structure::create(prototype, JSC::TypeInfo(JSC::ObjectType));
    }

    virtual void pushEventHandlerScope(JSC::ExecState*, JSC::ScopeChain&) const;


    // Custom functions
    JSC::JSValuePtr addEventListener(JSC::ExecState*, const JSC::ArgList&);
    JSC::JSValuePtr removeEventListener(JSC::ExecState*, const JSC::ArgList&);
    EventTargetNode* impl() const
    {
        return static_cast<EventTargetNode*>(Base::impl());
    }
};

EventTargetNode* toEventTargetNode(JSC::JSValuePtr);

class JSEventTargetNodePrototype : public JSC::JSObject {
public:
    static JSC::JSObject* self(JSC::ExecState*);
    virtual const JSC::ClassInfo* classInfo() const { return &s_info; }
    static const JSC::ClassInfo s_info;
    virtual bool getOwnPropertySlot(JSC::ExecState*, const JSC::Identifier&, JSC::PropertySlot&);
    static PassRefPtr<JSC::Structure> createStructure(JSC::JSValuePtr prototype)
    {
        return JSC::Structure::create(prototype, JSC::TypeInfo(JSC::ObjectType));
    }
    JSEventTargetNodePrototype(PassRefPtr<JSC::Structure> structure) : JSC::JSObject(structure) { }
};

// Functions

JSC::JSValuePtr jsEventTargetNodePrototypeFunctionAddEventListener(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
JSC::JSValuePtr jsEventTargetNodePrototypeFunctionRemoveEventListener(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
JSC::JSValuePtr jsEventTargetNodePrototypeFunctionDispatchEvent(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr, const JSC::ArgList&);
// Attributes

JSC::JSValuePtr jsEventTargetNodeOnabort(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnabort(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnblur(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnblur(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnchange(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnchange(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnclick(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnclick(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOncontextmenu(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOncontextmenu(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOndblclick(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOndblclick(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnerror(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnerror(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnfocus(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnfocus(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOninput(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOninput(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnkeydown(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnkeydown(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnkeypress(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnkeypress(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnkeyup(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnkeyup(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnload(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnload(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnmousedown(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnmousedown(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnmousemove(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnmousemove(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnmouseout(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnmouseout(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnmouseover(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnmouseover(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnmouseup(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnmouseup(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnmousewheel(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnmousewheel(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnbeforecut(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnbeforecut(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOncut(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOncut(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnbeforecopy(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnbeforecopy(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOncopy(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOncopy(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnbeforepaste(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnbeforepaste(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnpaste(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnpaste(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOndragenter(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOndragenter(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOndragover(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOndragover(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOndragleave(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOndragleave(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOndrop(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOndrop(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOndragstart(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOndragstart(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOndrag(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOndrag(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOndragend(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOndragend(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnreset(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnreset(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnresize(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnresize(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnscroll(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnscroll(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnsearch(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnsearch(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnselect(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnselect(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnselectstart(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnselectstart(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnsubmit(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnsubmit(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOnunload(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOnunload(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOntouchstart(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOntouchstart(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOntouchend(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOntouchend(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOntouchmove(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOntouchmove(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);
JSC::JSValuePtr jsEventTargetNodeOntouchcancel(JSC::ExecState*, const JSC::Identifier&, const JSC::PropertySlot&);
void setJSEventTargetNodeOntouchcancel(JSC::ExecState*, JSC::JSObject*, JSC::JSValuePtr);

} // namespace WebCore

#endif
