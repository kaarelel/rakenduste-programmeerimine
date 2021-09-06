function Item(props){
    return (
        <div>
            <div classname="itemname">{props.name}</div>
            <div classname="itemPrice">{props.price}</div>
            <div classname="itemCategory">{props.category}</div>
        </div>
    )
    
}

export default Item;