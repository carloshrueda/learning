/*
Source: https://www.30secondsofcode.org/js/s/render-dom-element/
View date: 2024-12-20   

Having a robust representation of the DOM tree, we can now create the function that 
renders the given tree in the specified container. The function will destructure the 
first argument into type and props, and use type to determine if the given element 
is a text element.
*/

const renderElement = ({ type, props = {} }, container) => {
  const isTextElement = !type;
  const element = isTextElement
    ? document.createTextNode('')
    : document.createElement(type);

  const isListener = p => p.startsWith('on');
  const isAttribute = p => !isListener(p) && p !== 'children';

  Object.keys(props).forEach(p => {
    if (isAttribute(p)) element[p] = props[p];
    if (!isTextElement && isListener(p))
      element.addEventListener(p.toLowerCase().slice(2), props[p]);
  });

  if (!isTextElement && props.children && props.children.length)
    props.children.forEach(childElement =>
      renderElement(childElement, element)
    );

  container.appendChild(element);
};

const myElement = {
  type: 'button',
  props: {
    type: 'button',
    className: 'btn',
    onClick: () => alert('Clicked'),
    children: [{ props: { nodeValue: 'Haz clic aquí' } }]
  }
};

renderElement(myElement, document.body.querySelector('section'));
// Renders our <button> element in the body of the document