fn main() {
    let numbers_list = vec![1, -2, 8, -5];
    let min_number = *numbers_list.iter().min().unwrap();
    println!("{}", min_number);
}
